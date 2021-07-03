package in.bala.javaEX.demo.repository;

import in.bala.javaEX.demo.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    public static List<Product> products=new ArrayList<>();

    public void addProduct(Product p){
        this.products.add(p);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void ListAllProducts() {
        for (Product product : this.products) {
            System.out.println(product.getId()+" --> "+product.getName());
        }
    }
}