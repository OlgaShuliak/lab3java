package com.company;

import java.util.List;

public class Goods {
    String name;
    String brand;
    double price;
    int quantity;
    String warehouseId;
    int minSell;

    public Goods(String name, String brand, double price, int quantity, String warehouseId, int minSell) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.warehouseId = warehouseId;
        this.minSell = minSell;
    }
    boolean deleteGood(String warehouse){
        if(Goods.this.warehouseId.equals(warehouse)){
            Goods.this.price= Double.parseDouble(null);
            Goods.this.quantity= Integer.parseInt(null);
            Goods.this.minSell= Integer.parseInt(null);
        }
        return true;
    }
    void getBySell(List<Goods> g){
            for(Goods goods:g){
                if( goods.minSell>100) {
                    System.out.println(goods.toString());
                }
            }
    }
    void getByWarehouse(List<Goods> g,String warehouse){
        for(Goods goods: g){
            if(goods.warehouseId.equals(warehouse))
                System.out.println(goods.toString());
        }
    }
    void getPriceList(List<Goods> g){
        for(Goods goods:g){
            System.out.println("Name: "+goods.name+" Brand: "+goods.brand+" Price: "+goods.price+" Quantity: "+goods.quantity);
        }
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", warehouseId='" + warehouseId + '\'' +
                ", minSell=" + minSell +
                '}';
    }
}
