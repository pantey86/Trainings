package ua.myTrainings.patterns.behavioral.iterator;

public class Car implements Iterable <String> {

    private String model;
    private String[] parts;

    public Car(String model, String[] parts) {
        this.model = model;
        this.parts = parts;
    }

    public String getModel() {
        return model;
    }

    public String[] getParts() {
        return parts;
    }

    @Override
    public Iterator <String> iterator() {
        return new PartsIterator();
    }

    private class PartsIterator implements Iterator <String> {

        private int currentElement;

        @Override
        public boolean hasNext() {
            return currentElement < parts.length;
        }

        @Override
        public String next() {
            return parts[currentElement++];
        }
    }
}
