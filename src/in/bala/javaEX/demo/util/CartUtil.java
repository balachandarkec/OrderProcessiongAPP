package in.bala.javaEX.demo.util;

import in.bala.javaEX.demo.model.Cart;
import in.bala.javaEX.demo.model.Product;
import in.bala.javaEX.demo.repository.ProductRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CartUtil {

    //Cart mycart=null;
     static Cart mycart=new Cart();
    //private static Object Product;

    public static Cart createCart(){
        Random rand = new Random();
        HashSet<Product> products =new  HashSet<Product>();
        mycart.setCartId(rand.nextInt());
        mycart.setProductSet(products);
        return mycart;
    }

    public static Cart addProductToCart(Cart cart, Product item){

      List<Product> products=  ProductRepository.getProducts();
      if (products.contains(item)) {
          cart.getProductSet().add(item);
      }
        return cart;

    }

    public static Cart removeProductToCart(Cart cart, Product item){
        cart.getProductSet().remove(item);
        return cart;
    }

}
