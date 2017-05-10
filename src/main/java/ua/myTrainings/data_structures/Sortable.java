package ua.myTrainings.data_structures;

import java.util.Comparator;

public interface Sortable {

    public boolean bubbleSort ();

    public boolean bubbleSort (Comparator comparator);

    public boolean selectionSort ();

    public boolean selectionSort (Comparator comparator);

    public boolean insertionSort ();

    public boolean insertionSort (Comparator comparator);

    public boolean mergeSort ();

    public boolean mergeSort (Comparator comparator);

    public boolean heapSort ();

    public boolean heapSort (Comparator comparator);



}
