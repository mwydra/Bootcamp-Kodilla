package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Supplier{
    private final String supplierName = "Extra Food Shop";

    @Override
    public boolean process(Order order) {
        if(order.getQuantity() > 0){
            System.out.println(supplierName + "\nNowe zamówienie: " + order.getProductName() + ", ilość: " + order.getQuantity());
            if(order.getQuantity() > 10) {
                System.out.println("Dostawa gratis!");
            }
            return true;
        }else {
            return false;
        }
    }
}
