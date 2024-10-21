package com.anasdev.api.ensmr.Controller;


import com.anasdev.api.ensmr.model.Produit;
import com.anasdev.api.ensmr.services.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/produit")
    @AllArgsConstructor
    public class ProduitController {

        @Autowired
        private ProduitService produitService ;

        @PostMapping("/add")
        public Produit add(@RequestBody Produit produit) {
            return produitService.create(produit);
        }

        @GetMapping("/list")
        public List<Produit> getAll(){
            return produitService.getAll();
        }
        @PutMapping("/update/{id}")
        public Produit update(@PathVariable Long id,@RequestBody Produit produit){
            return produitService.update(id, produit);
        }

        @DeleteMapping("/delete/{id}")
        public String delete(@PathVariable Long id){
            return produitService.delete(id);
        }


    }

