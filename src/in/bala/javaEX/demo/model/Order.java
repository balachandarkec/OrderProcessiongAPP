package in.bala.javaEX.demo.model;

public class Order {
    private int order_id;
    private String customer_name;
    private Cart cart;

    public Order() {
    }

    public Order(int order_id, String customer_name, Cart cart) {
        this.order_id = order_id;
        this.customer_name = customer_name;
        this.cart = cart;
    }


    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", customer_name='" + customer_name + '\'' +
                ", cart=" + cart.toString() +
                '}';
    }
}
