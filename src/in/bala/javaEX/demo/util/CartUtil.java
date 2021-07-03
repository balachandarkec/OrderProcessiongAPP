package in.bala.javaEX.demo.util;

import in.bala.javaEX.demo.model.Cart;
import in.bala.javaEX.demo.model.Product;

import java.util.Random;
import java.util.Set;

public class CartUtil {

    Cart mycart=null;

    public static Cart createCart(){
        Random rand = new Random();
        Cart mycart=new Cart();
        mycart.setCartId(rand.nextInt());
        return mycart;
    }

    public static Cart addProductToCart(Cart cart, Product item){
        cart.getProductSet().add(item);
        return cart;
    }

    public static Cart removeProductToCart(Cart cart, Product item){
        cart.getProductSet().remove(item);
        return cart;
    }

}
