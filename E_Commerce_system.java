package com.mycompany.e_commerce_system;
import java.util.Scanner;
public class E_Commerce_system {

    public static void main(String[] args) {

   Scanner input = new Scanner(System.in);



        //Creating customer
        System.out.println("Welcome to the E-commerce system");
        System.out.println("Enter your customerId");
        int customerId = Math.abs(input.nextInt());
        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("Enter your address");
        String address = input.next();
        Customer customer = new Customer(23012042,"Asser","San Stefano");

        System.out.println("How many products you want to add to your cart");
        int num_Of_Products = input.nextInt();

        Cart cart = new Cart(customerId ,num_Of_Products );
        cart.addProduct(num_Of_Products);
        int x = 1;
        Order order = new Order (customerId, num_Of_Products, (float)cart.calculatePrice(), x, cart.products);

        System.out.println("Your total is " +cart.calculatePrice()+"Would you like to place the order?  1- Yes  2- No");
        int YN = input.nextInt();

        if(cart.placeOrder(YN)== true){
            order.printOrderInfo();
            x++;
        }








    }
}
