package com.tp_cesi.banconet.repository;

import com.tp_cesi.banconet.model.CompteCourant;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CompteCourantRepository extends CrudRepository<CompteCourant, Integer> {

}