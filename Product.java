package com.mycompany.e_commerce_system;

public class Product {
  private int productId;
  private String name;
  private float price;
  
  Product(int productId , String name, float price){
  if(productId < 0){
  this.productId = Math.abs(productId);
  }else{
  this.productId = productId;
  }
  if (price < 0){
  this.price = Math.abs(price);
  }else{
  this.price = price;
  }
  this.name = name;
  }
  
    public void set_productId(int productId){
        if (productId > 0){
            this.productId = productId;}
        
        else{
            Math.abs(productId);
            this.productId = productId;}
        }
    
    public void set_name(String name){
        this.name = name;
    }
    
    public void set_price(float price){
    if(price > 0){
    this.price = price;
    }
    
    else{
    Math.abs(price);
    this.price = price;
    }
    
    }
    
    public int get_productId(){
    return productId;
    }
    
    public String get_name(){
    return name;
    }
    
    public float get_price(){
    return price;
    }
    
    }

