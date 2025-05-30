package com.mycompany.e_commerce_system;


import java.util.Scanner;
public class Cart {
    
    
   private int customerId;
   private int nProducts;
   Product[] products;
Scanner input = new Scanner(System.in);

Cart(int customerId, int nProducts){
this.customerId = customerId;
this.nProducts = nProducts;
this.products = new Product[nProducts];
}
    
    public void set_customerId(int customerId){
    if(customerId > 0 ){
    this.customerId = customerId;
    }
    
    else{
    Math.abs(customerId);
    this.customerId = customerId;
    }
    }
    
    public void set_nProducts(int nProducts){
    if (nProducts > 0 ){
    this.nProducts = nProducts;
    }
    
    else{
    Math.abs(nProducts);
    this.nProducts = nProducts;
    }
    }
    
    public int get_customerId(){
    return customerId;
    }
    
    public int get_nProducts(){
    return nProducts;
    }
    
    public void set_products(Product[] products){
    this.products = products;
    }
    
    public Product[] get_products(){
    return products;
    }
    
    
    public void addProduct(int n){
                Electronic_product electronicProduct = new Electronic_product("IPhone",1,599.9f,"Apple",1);
                Clothing_product clothingproduct = new Clothing_product("Medium","Cotton",2,"T-shirt",19.99f);
                Book_product bookproduct = new Book_product("O'Reilly","X Publications",3,"OOP",39.99f);

        for(int i = 0; i < n; i++){
        System.out.println("Which product would you like to add?  1- Smartphone  2- T-Shirt  3- OOP");
        int P =input.nextInt();
        switch(P){
            case 1:
                products[i] = electronicProduct;
                break;
            case 2:
                products[i] = clothingproduct;
                break;
            case 3:
                products[i] = bookproduct;
                break;
            default:
                System.out.println("Invalid option");
                break;
        
        }
        }        
                
    }
    
    public void removeProduct(int m){
        products[m] = null;
    }
    
public double calculatePrice() {
    float sum = 0f;
    for (int i = 0; i < nProducts; i++) {
        Product product = products[i];
        if (product != null) {
            sum += product.get_price();
        }
    }
    return sum;
}
    
    public boolean placeOrder(int flag){
    boolean f = true;
    if(flag == 1){
    f = true;
    }else if (flag == 2){
        f = false;
    }
    return f;
    }
    
}
