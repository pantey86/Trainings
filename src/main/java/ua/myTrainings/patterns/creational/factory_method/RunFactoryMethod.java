package ua.myTrainings.patterns.creational.factory_method;

public class RunFactoryMethod {

    public static void main(String[] args) {

        TransportCreator transportCreator1 = createTransportCreatorByType("car");
        Transport transport1 = transportCreator1.createTransport();
        transport1.move();

        TransportCreator transportCreator2 = createTransportCreatorByType("plane");
        Transport transport2 = transportCreator2.createTransport();
        transport2.move();

        TransportCreator transportCreator3 = createTransportCreatorByType("TRAIN");
        Transport transport3 = transportCreator3.createTransport();
        transport3.move();

        TransportCreator transportCreator4 = createTransportCreatorByType("BOAT");
        Transport transport4 = transportCreator4.createTransport();
        transport4.move();
    }

    private static TransportCreator createTransportCreatorByType(String transportType) {
        if (transportType.equalsIgnoreCase("car"))
            return new CarCreator();
        else if (transportType.equalsIgnoreCase("plane"))
            return new PlaneCreator();
        else if (transportType.equalsIgnoreCase("train"))
            return new TrainCreator();
        else throw new RuntimeException("There no such type of transport in our program");
    }

}
