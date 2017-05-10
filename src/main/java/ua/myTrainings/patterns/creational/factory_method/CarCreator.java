package ua.myTrainings.patterns.creational.factory_method;


public class CarCreator implements TransportCreator {

    @Override
    public Transport createTransport() {
        return new Car();
    }
}
