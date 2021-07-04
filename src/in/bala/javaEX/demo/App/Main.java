package in.bala.javaEX.demo.App;

import in.bala.javaEX.demo.controller.ProductController;
import in.bala.javaEX.demo.exceptions.NegativePriceException;
import in.bala.javaEX.demo.model.Cart;
import in.bala.javaEX.demo.model.Order;
import in.bala.javaEX.demo.model.Product;
import in.bala.javaEX.demo.util.CartUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int pass=0;
      ProductController productController=new ProductController();
        Scanner scan=new Scanner(System.in);


        Product p=null;
        Cart cart=null;
        Order order=null;

        do{
            System.out.println("1. Create Product");
            System.out.println("2. List ALl Products");
            System.out.println("3. Create Cart and add Products");
            System.out.println("4. Place Order!");
            System.out.println("5. Order Summary!");
            System.out.println("6.Exit");
            System.out.println("Enter the Choice :");
            int option=Integer.parseInt(scan.nextLine());


      switch (option){
          case 1:
              System.out.println("Enter the Prodcut ID:");
              int pid=Integer.parseInt(scan.nextLine());
              System.out.println("Enter the Prodcut Name:");
              String name=scan.nextLine();
              System.out.println("Enter the Prodcut Quantity :");
              int qty=Integer.parseInt(scan.nextLine());
              double price=0d;
              try {
                  System.out.println("Enter the Prodcut Price :");
                  price = Double.parseDouble(scan.nextLine());
                  if(price<=0){
                      throw new NegativePriceException("Negative price not allowed!");
                  }
              }catch (Exception e){
                  e.printStackTrace();
              }
             p= productController.createProduct(pid,name,qty,price);
             if(p !=null){
                 System.out.println("Product Created Successfully!");
             }else{
                 System.out.println(" Unable to Create Product ");
             }
              break;

          case 2:
              System.out.println("All Stocke are :");
             productController.getRepository().ListAllProducts();
              break;

          case 3:
              System.out.println( "Avalable Products");
              productController.getRepository().ListAllProducts();
              if (cart==null) {
                  cart = CartUtil.createCart();
              }
              System.out.println("Enter the product id fo addin the cart item :");
               int id= Integer.parseInt(scan.nextLine());
              System.out.println("Enter the product Qty:");
              int q= Integer.parseInt(scan.nextLine());

               Product p1 =productController.getRepository().findProductById(id);
               if (p1 != null){
                   Product p2 =new Product(p1.getId(),p1.getName(),q,p1.getPrice());
               CartUtil.addProductToCart(cart, p2);
                   System.out.println("Product Added to cart !");
                   // get quantity from user and update it
                   System.out.println(cart.toString());
               }
                else{
                   System.out.println("Invalid Product ID");
               }

              break;
          case 4:
                     // Place order
              break;

          case 5:

              break;
       }
            System.out.println("Do You Want to Continue! yes ->1 No -> any");
            pass=Integer.parseInt(scan.nextLine());
        }while(pass == 1);

    }
}
