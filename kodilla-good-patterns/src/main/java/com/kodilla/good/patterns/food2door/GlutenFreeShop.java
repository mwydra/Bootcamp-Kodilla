package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements Supplier{
    private final String supplierName = "Gluten Free Shop";

    @Override
    public boolean process(Order order) {
        if(order.getProductName().contains("gluten")) {
            System.out.println("Sprzedajemy wyłącznie produkty bezglutenowe");
            return false;
        }
        else if(order.getQuantity() > 0){
            System.out.println(supplierName + "\nNowe zamówienie: " + order.getProductName() + ", ilość: " + order.getQuantity());
            return true;
        }else {
            return false;
        }
    }
}
