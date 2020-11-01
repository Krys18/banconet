package com.tp_cesi.banconet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class CompteCourant {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer numero;

  private String intitule;

  private Double solde;

  private Double montantDecouvertAutorise;

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public String getIntitule() {
    return intitule;
  }

  public void setIntitule(String intitule) {
    this.intitule = intitule;
  }

  public Double getSolde() {
    return solde;
  }

  public void setSolde(Double solde) {
    this.solde = solde;
  }

  public Double getMontantDecouvertAutorise() {
    return montantDecouvertAutorise;
  }

  public void setMontantDecouvertAutorise(Double montantdecouvertautorise) {
    this.montantDecouvertAutorise = montantdecouvertautorise;
  }
}