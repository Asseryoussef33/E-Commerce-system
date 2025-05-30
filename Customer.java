package com.mycompany.e_commerce_system;



public class Customer {

    public Customer(int par, String asser, String san_Stefano) {
    }

   private int customerId;
   private String name;
   private String address;
    
    public void set_customerId(int customerId){
    if(customerId > 0){
    this.customerId = customerId;
    }
    
    else{
    Math.abs(customerId);
    this.customerId = customerId;
    }
    }
    
    public void set_name(String name){
    this.name = name;
    }
    
    public void set_address(String address){
    this.address = address;
    }
    
    public int get_customerId(){
    return customerId;
    }
    
    public String get_name(){
    return name;
    }
    
    public String get_address(){
    return address;
    }
    
}
