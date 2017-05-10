package ua.myTrainings.patterns.creational.factory_method;

public class Car implements Transport {

    @Override
    public void move() {
        System.out.println("Car moves on the roads");
    }
}
