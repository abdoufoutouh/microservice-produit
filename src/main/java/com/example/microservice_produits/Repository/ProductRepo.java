package com.example.microservice_produits.Repository;
import com.example.microservice_produits.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo  extends JpaRepository<Product, Long> {

}
