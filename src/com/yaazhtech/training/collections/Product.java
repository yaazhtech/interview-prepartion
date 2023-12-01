package com.yaazhtech.training.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Product {
    //Data types pre avail
    String productName; // immutable (hashcode=9023484 and value-book)
    Integer productId; // immutable (hashcode=9023484 and value-book)
    int productTagId; // immutable (value-book)
    long productTranscationId;
    BigDecimal productPrice;
    //Price pojo
    Price price;
    // multiple product
    Product p=new Product();
    //p.setName(0sf)
// collection of these datatypes

    List<Price> priceList=new ArrayList<>(); // Linked list high performance insertion and deletion and why?
    // for fast retrivel using index based search arraylist is best but its poor for insertion and deletion
    // (bcz it has to swift the elements when
    // arraylist size is getting changed.)
    List<String> stringList=new ArrayList<>();
    Map<Price,Price> pricePriceMap=new HashMap<>(); // Group by or order By if you map

   // Customer, orders

            Map<Customer,List<Orders>> customerListMap=new HashMap<>();

            //
    Customer customer=new Customer();






   // linkedlist
    // what is load factor for each collection
    // why this collection
    // hirerchy of this collection
    // how streams whould be applied on this collection
    // null is accepted or not
    // sorted or not
    // maintains insertion order or not
    // internal impl technique
    //Arryalist,vector, map,table,stack,queue
    // what is load factor for each collection
    // why this collection
    // hirerchy of this collection
    // how streams whould be applied on this collection
    // null is accepted or not
    // sorted or not
    // maintains insertion order or not
    // internal impl technique




    //java is passed by value or ref? ref is for objects and value for primitive
}
