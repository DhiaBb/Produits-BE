package com.dhia.produits.service;

import com.dhia.produits.entities.Produit;

import java.util.List;

public interface produitService {
    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void  deleteProduitById(Long id);
    Produit getProduit(Long id);
    List<Produit> getAllproduits();


}
