package com.tp_cesi.banconet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class Client {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer identifiant;

  private String nom;

  private String prenom;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "compte_courant_id", referencedColumnName = "id")
  private CompteCourant compteCourant;

  @OneToMany(mappedBy = "client")
  private List<CompteEpargne> compteEpargnes;

  public List<CompteEpargne> getCompteEpargnes() {
    return compteEpargnes;
  }

  public void setCompteEpargnes(List<CompteEpargne> compteEpargnes) {
    this.compteEpargnes = compteEpargnes;
  }

  public CompteCourant getCompteCourant() {
    return compteCourant;
  }

  public void setCompteCourant(CompteCourant compteCourant) {
    this.compteCourant = compteCourant;
  }

  public Integer getIdentifiant() {
    return identifiant;
  }

  public void setIdentifiant(Integer identifiant) {
    this.identifiant = identifiant;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }
}