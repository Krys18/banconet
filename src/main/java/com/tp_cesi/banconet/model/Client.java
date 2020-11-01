package com.tp_cesi.banconet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Client {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer identifiant;

  private String nom;

  private String prenom;

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