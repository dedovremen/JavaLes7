package com.company;

public interface MyCollectionApi<T> {
    void add (T item);
    T get(int index);
    int getSize();
}
