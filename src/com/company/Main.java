package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    Goods g=new Goods("Mouse","Hp",150.1,980,"id1234",101);
    Goods g1=new Goods("Beton","Betonskiy",15.1,1980,"id1235",10);
    Goods g2=new Goods("Voda","Morsh",1500.1,910,"id1234",200);
    List<Goods> goodsList=new ArrayList<>();
        goodsList.add(g);
        goodsList.add(g1);
        goodsList.add(g2);
        g.getByWarehouse(goodsList,"id1234");
        System.out.println();
        g.getBySell(goodsList);
        System.out.println();
        g.getPriceList(goodsList);
        System.out.println();
        System.out.println(g.deleteGood("id12345"));
    }
}
