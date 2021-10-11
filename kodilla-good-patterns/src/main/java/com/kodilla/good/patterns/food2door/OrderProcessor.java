package com.kodilla.good.patterns.food2door;

public class OrderProcessor {
    public void processOrder(Supplier supplier, Order order){
        supplier.process(order);
    }
}
