package com.tp_cesi.banconet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class CompteCourant {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String intitule;

  private Double solde;

  private Double montantDecouvertAutorise;

  @OneToOne(mappedBy = "compteCourant")
  @JsonIgnore
  private Client client;

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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