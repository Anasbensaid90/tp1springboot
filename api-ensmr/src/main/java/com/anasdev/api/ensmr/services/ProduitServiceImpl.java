package com.anasdev.api.ensmr.services;

import com.anasdev.api.ensmr.model.Produit;
import com.anasdev.api.ensmr.repo.Produitrepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    private Produitrepo produitRepository ;
    @Override
    public Produit create(Produit produit) {
        return produitRepository.save(produit);
    }
    @Override
    public List<Produit> getAll() {
        return produitRepository.findAll();
    }
    @Override
    public Produit update(Long id, Produit produit) {
        return produitRepository.findById(id).map(p ->{
            p.setNom(produit.getNom());
            p.setDescription(produit.getDescription());
            p.setPrix(produit.getPrix());
            return produitRepository.save(p);
        }).orElseThrow(()->new RuntimeException("Produit non trouvé"));
    }
    @Override
    public String delete(Long id) {
        produitRepository.deleteById(id);
        return "Produit supprimé";
    }
}
