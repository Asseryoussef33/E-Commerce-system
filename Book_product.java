package com.mycompany.e_commerce_system;



public class Book_product extends Product {


    
    private String author;
    private String publisher;
    
         Book_product(String author, String publisher,int productId, String name, float price) {
        super(productId,name,price);
        this.author = author;
        this.publisher = publisher;
        }

    
    
    public void set_author(String author){
    this.author = author;
    }
    
    public void set_publisher(String publisher){
    this.publisher = publisher;
    }
    
    public String get_author(){
    return author;
    }
    
    public String get_publisher(){
    return publisher;
    }
    
}
