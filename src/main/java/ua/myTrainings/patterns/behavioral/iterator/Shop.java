package ua.myTrainings.patterns.behavioral.iterator;

import java.util.List;

public class Shop implements Iterable{

    private String name;
    private List <String> products;

    public Shop(String name, List<String> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public List<String> getProducts() {
        return products;
    }

    @Override
    public Iterator iterator() {
        return new ProductIterator();
    }

    private class ProductIterator implements Iterator<String> {

        private int currentElement;

        @Override
        public boolean hasNext() {
            return currentElement<products.size();
        }

        @Override
        public String next() {
            return products.get(currentElement++);
        }
    }
}
