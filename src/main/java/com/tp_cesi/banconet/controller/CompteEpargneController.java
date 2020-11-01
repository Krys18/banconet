package com.tp_cesi.banconet.controller;

import com.tp_cesi.banconet.model.Client;
import com.tp_cesi.banconet.model.CompteEpargne;
import com.tp_cesi.banconet.repository.CompteEpargneRepository;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/compteEpargne") // This means URL's start with /demo (after Application path)
public class CompteEpargneController {
  @Autowired // This means to get the bean called userRepository
         // Which is auto-generated by Spring, we will use it to handle the data
  private CompteEpargneRepository compteEpargneRepository;


  @PostMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addCompteEpargne (@RequestParam String intitule
      , @RequestParam Double solde, @RequestParam Double tauxInteret) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    CompteEpargne n = new CompteEpargne();
    n.setIntitule(intitule);
    n.setSolde(solde);
    n.setTauxInteret(tauxInteret);
    compteEpargneRepository.save(n);
    return "Saved";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<CompteEpargne> getAllUsers() {
    // This returns a JSON or XML with the users
    return compteEpargneRepository.findAll();
  }
}