package in.bala.javaEX.demo.App;

import in.bala.javaEX.demo.controller.ProductController;
import in.bala.javaEX.demo.model.Cart;
import in.bala.javaEX.demo.model.Order;
import in.bala.javaEX.demo.model.Product;

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
            System.out.println("3. Create Cart");
            System.out.println("4. Place Order!");
            System.out.println("5.Exit");
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
              System.out.println("Enter the Prodcut Price :");
             double price=Double.parseDouble(scan.nextLine());
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

          case 5:

              break;
       }
            System.out.println("Do You Want to Continue! yes ->1 No -> any");
            pass=Integer.parseInt(scan.nextLine());
        }while(pass == 1);

    }
}
