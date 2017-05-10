package ua.myTrainings.patterns.creational.factory_method;

public class Plane implements Transport {

    @Override
    public void move() {
        System.out.println("Plane moves in the sky");
    }
}
