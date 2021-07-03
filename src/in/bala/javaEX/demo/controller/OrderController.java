package in.bala.javaEX.demo.controller;

import in.bala.javaEX.demo.model.Cart;
import in.bala.javaEX.demo.model.Order;
import in.bala.javaEX.demo.util.CartUtil;
import in.bala.javaEX.demo.util.OrderProcessingUtil;

public class OrderController {
    private Cart cart;
    private Order order;

    public Cart createCart(){
       return CartUtil.createCart();
    }


    public Order createOrder(String name,Cart cart){
        return OrderProcessingUtil.placeOrder(name,cart);

    }

    public void orderSummary(Order order){
        OrderProcessingUtil.printOrderDetails(order);
    }

}
