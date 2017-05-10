package ua.myTrainings.patterns.creational.factory_method;


public class PlaneCreator implements TransportCreator {

    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
