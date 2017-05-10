package ua.myTrainings.patterns.creational.factory_method;

public class Train implements Transport {

    @Override
    public void move() {
        System.out.println("Train moves on the rails");
    }
}
