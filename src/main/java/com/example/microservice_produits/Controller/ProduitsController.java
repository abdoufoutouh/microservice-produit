package com.example.microservice_produits.Controller;
import com.example.microservice_produits.Config.MesConfigs;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduitsController {

    @Value("${mes-configs.limitDeProduits}")
    private int limitDeProduits;

    @GetMapping("/config")
    public int config() {
       return limitDeProduits;
    }
}
