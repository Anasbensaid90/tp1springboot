package com.anasdev.api.ensmr.services;

import com.anasdev.api.ensmr.model.Produit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProduitService {

    public Produit create(Produit produit);
    public List<Produit> getAll();
    public Produit update(Long id,Produit produit);
    public String delete(Long id);

}
