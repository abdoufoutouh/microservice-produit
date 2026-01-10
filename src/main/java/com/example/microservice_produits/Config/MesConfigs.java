package com.example.microservice_produits.Config;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "mes-configs")
public class MesConfigs {

    private  int limitProduits;

    public int getLimitProduits() {
        return limitProduits;
    }
    public void setLimitProduits(int limitProduits) {
        this.limitProduits = limitProduits;
    }

}
