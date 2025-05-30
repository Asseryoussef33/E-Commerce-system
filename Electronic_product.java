package com.mycompany.e_commerce_system;



public class Electronic_product extends Product {


    private String brand;
    private int warranty_period;
    
         Electronic_product(String brand, int warranty_period, float price, String name, int productId) {
         super(productId,name,price);    
         this.brand = brand;
         if(warranty_period < 0){
         this.warranty_period = Math.abs(warranty_period);
         }else{
         this.warranty_period = warranty_period;
         }
         }

    
    
    public void set_brand(String brand){
    this.brand = brand;
    }
    
    public void set_warranty_period(int warranty_period){
    if(warranty_period > 0){
    this.warranty_period = warranty_period;
    }
    
    else{
    Math.abs(warranty_period);
    this.warranty_period = warranty_period;
    }
    
    }
    
    public String get_brand(){
    return brand;
    }
    
    public int warranty_period(){
    return warranty_period;
    }
    
}
