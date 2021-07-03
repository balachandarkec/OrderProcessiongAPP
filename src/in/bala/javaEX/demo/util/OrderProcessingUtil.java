package in.bala.javaEX.demo.util;

import in.bala.javaEX.demo.model.Cart;
import in.bala.javaEX.demo.model.Order;

public class OrderProcessingUtil {

    public static Order placeOrder(String name,Cart cart) {
        Order order = new Order(cart.getCartId(), name, cart);
        return order;
    }

    public  static void printOrderDetails(Order o){
        System.out.println(o.toString());
    }

}