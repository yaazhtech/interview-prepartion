package com.yaazhtech.training.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Filpkart {

    public static void main(String args[]){

        System.out.println("Welcome to flipkart");

        Customer customer=new Customer();
        customer.setName("dsf");

        Orders orders=new Orders();

        Map<Customer, List<Orders>> customerMap=new HashMap<>();
        List<Orders> ordersList=new ArrayList<>();
        ordersList.add(orders);
        customerMap.put(customer,ordersList);
        /*
        for(int i){

        }*/

        //customerMap.entrySet().stream().
    }
}
