package com.dhia.produits.controller;

import com.dhia.produits.entities.Produit;
import com.dhia.produits.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.List;

@Controller
public class ProduitController {
    @Autowired
    ProduitService produitService;
    @RequestMapping("/showCreate")
    public String showCreate()
    {
        return "createProduit";
    }

    @RequestMapping("/saveProduit")
    public String saveProduit( @ModelAttribute("produit") Produit produit,
                                @RequestParam("date")String date,
                                ModelMap modelMap) throws ParseException
    {
        //conversion de la date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date dateCreation = dateFormat.parse(String.valueOf(date));
        produit.setDateCreation(dateCreation);
        Produit saveProduit = produitService.saveProduit(produit);
        String msg ="produit enregistré avec Id" + saveProduit.getIdProduit();
        modelMap.addAttribute("msg" , msg);
        return "createProduit";
    }
    @RequestMapping("/ListeProduits")
    public String listeProduits(ModelMap modelMap)
    {
        List<Produit> prods=produitService.getAllproduits();
        modelMap.addAttribute("produits",prods);
        return "listeProduits";
    }


}