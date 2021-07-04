package in.bala.javaEX.demo.repository;

import in.bala.javaEX.demo.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    public static List<Product> products=new ArrayList<>();

    public static void addProduct(Product p){
      products.add(p);
    }

    public static List<Product> getProducts() {
        return products;
    }

    public static void setProducts(List<Product> products) {
        products = products;
    }


    public static Product findProductById(int id) {
            Product result=null;
        for (Product p: products) {
            if (id==p.getId()){
                result=p;
                break;
            }
        }
          return result;


    }


    public static void ListAllProducts() {
        for (Product product : products) {
            System.out.println(product.getId()+" --> "+product.getName());
        }
    }



}