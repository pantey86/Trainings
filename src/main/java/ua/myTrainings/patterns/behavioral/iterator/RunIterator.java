package ua.myTrainings.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class RunIterator {
    public static void main(String[] args) {
        String [] parts = {"wheels","doors","gastank"};
        Car car = new Car ("BMW",parts);
        Iterator partsIter = car.iterator();

        System.out.println("Car model: "+car.getModel());
        System.out.println("Car parts: ");
        while (partsIter.hasNext()){
            System.out.println(partsIter.next().toString());
        }


        List <String> products = new ArrayList<>();
        products.add("milk");
        products.add("sugar");
        products.add("salt");

        Shop shop = new Shop("ATB",products);

        Iterator prodIter = shop.iterator();

        System.out.println("Shop : "+shop.getName());
        System.out.println("Shop products : ");
        while (prodIter.hasNext()){
            System.out.println(prodIter.next().toString());
        }
    }
}
