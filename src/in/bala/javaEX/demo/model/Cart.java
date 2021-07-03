package in.bala.javaEX.demo.model;

import java.util.Set;

public class Cart {
    private int cartId;
    private Set<Product> productSet;

    public Cart() {
    }

    public Cart(int cartId, Set<Product> productSet) {
        this.cartId = cartId;
        this.productSet = productSet;
    }

    public Double findCartValue(){
        Double total_value=0d;
        for (Product p: this.productSet) {

            total_value+=(p.getPrice()*p.getQuantity());
        }
        return  total_value;
    }




    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", productSet=" + productSet +
                "Cart Value= "+this.findCartValue()+
                '}';
    }

}
