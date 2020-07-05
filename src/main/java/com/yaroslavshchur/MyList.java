package main.java.com.yaroslavshchur;

import java.util.ArrayList;
import java.util.Collections;

public class MyList<T extends Comparable<? super T>> {

    ArrayList<T> arrayList = new ArrayList<>();

    public void add(T addType) {
        arrayList.add(addType);
    }

    public T getMaxValue() {
        return Collections.max(arrayList);
    }

    public T getMinValue() {
        return Collections.min(arrayList);
    }

    @Override
    public java.lang.String toString() {
        return "MyList: " + arrayList;
    }
}

