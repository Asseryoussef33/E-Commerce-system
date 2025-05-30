package com.mycompany.e_commerce_system;


public class Order {


    private int customerId;
    private int orderId;
    private float totalPrice;
    private int nProducts;
    Product[] products;

    Order(int customerId, int nProducts,float totalPrice, int orderId,Product[] prod) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = new Product[nProducts];
        this.totalPrice = Math.abs(totalPrice);
        this.nProducts = nProducts;
        products = prod;
    }

    public void printOrderInfo(){
        System.out.println("Here's your order summary:");
        System.out.println("Order ID: " + orderId );
        System.out.println("Customer ID: " + customerId);
        System.out.println("products: ");
        for (int i = 1; i < nProducts ; i++){
            Product product = products[i];
            System.out.println(product.get_name() + " - $" + product.get_price());
        }
        System.out.println("Total price: " +totalPrice);

    }


}