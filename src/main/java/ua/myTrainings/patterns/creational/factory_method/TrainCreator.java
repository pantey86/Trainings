package ua.myTrainings.patterns.creational.factory_method;

public class TrainCreator implements TransportCreator {

    @Override
    public Transport createTransport() {
        return new Train();
    }
}
