package com.example.microservice_produits.Controller;
import com.example.microservice_produits.config.ApplicationPropertiesConfiguration;
import com.example.microservice_produits.Repository.ProductRepo;
import com.example.microservice_produits.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProduitsController {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    ApplicationPropertiesConfiguration appProperties ;

    // Affiche la liste de tous les produits disponibles
    @GetMapping(value = "/Produits")
    public List<Product> listeDesProduits() {
        System.out.println(" ********* ProductController listeDesProduits() ");
        List<Product> products = productRepo.findAll();

        int limit = Math.min(appProperties.getLimitDeProduits(), products.size());
        List<Product> listeLimitee = products.subList(0, appProperties.getLimitDeProduits());

        return listeLimitee;
    }
    // Récuperer un produit par son id
    @GetMapping("/Produits/{id}")
    public Product getProduit(@PathVariable Long id) {
        Optional<Product> product = productRepo.findById(id);
        return product.orElse(null);
    }



}
