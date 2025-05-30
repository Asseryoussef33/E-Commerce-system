package com.mycompany.e_commerce_system;

    
public class Clothing_product extends Product {


    
    private String size;
    private String fabric;
    
         Clothing_product(String size, String fabric,int productId, String name, float price) {
         super(productId,name,price);
         this.size = size;
         this.fabric = fabric;
        
        }

    
    
    public void set_size(String size){
    this.size = size;
    }
    
    public void set_fabric(String fabric){
    this.fabric = fabric;
    }
    
    public String get_size(){
    return size;
    }
    
    public String get_fabric(){
    return fabric;
    }
}
