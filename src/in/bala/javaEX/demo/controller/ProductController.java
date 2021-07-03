package in.bala.javaEX.demo.controller;

import in.bala.javaEX.demo.model.Product;
import in.bala.javaEX.demo.repository.ProductRepository;

public class ProductController {
 ProductRepository repository=new ProductRepository();
    public Product createProduct(int id, String name, int quantity, Double price){
        Product p=new Product(id,name,quantity,price);
        repository.addProduct(p);
        return p;
    }


    public ProductRepository getRepository(){

        return repository;
    }


    public Product updatePrice(Product p,Double newPrice){
        p.setPrice(newPrice);
        return p;
    }
}
