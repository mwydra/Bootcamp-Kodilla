package com.kodilla.good.patterns.food2door;

public class HealthyShop implements Supplier{
    private final String supplierName = "Healthy Shop";

    @Override
    public boolean process(Order order) {
        if(order.getQuantity() > 0){
            System.out.println(supplierName + "\nNowe zamówienie: " + order.getProductName() + ", ilość: " + order.getQuantity());
            return true;
        }else {
            return false;
        }
    }
}
