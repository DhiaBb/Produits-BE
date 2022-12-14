package com.dhia.produits.service;

import com.dhia.produits.entities.Produit;
import com.dhia.produits.repos.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class produitServiceImpl implements produitService {
    @Autowired
    ProduitRepository produitRepository;
    @Override
    public Produit saveProduit(Produit p) {
        return produitRepository.save(p) ;
    }

    @Override
    public Produit updateProduit(Produit p) {
        return produitRepository.save(p) ;
    }

    @Override
    public void  deleteProduit(Produit p) {
         produitRepository.delete(p);

    }

    @Override
    public void  deleteProduitById(Long id) {
         produitRepository.deleteById(id);
    }

    @Override
    public Produit getProduit(Long id) {
        return produitRepository.findById(id).get() ;


    }

    @Override
    public List<Produit> getAllproduits() {
        return produitRepository.findAll();
    }
}
