package com.anasdev.api.ensmr.repo;

import com.anasdev.api.ensmr.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Produitrepo extends JpaRepository<Produit, Long> {

}
