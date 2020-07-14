package com.company;

public class MyCollectionImpl<T> implements MyCollectionApi<T>, FullNameApi<T> {
   protected Object[] items;
   protected int size;
   protected String fullName;

   private final static int INITIAL_SIZE = 10;

    public MyCollectionImpl() {
        items = new Object[INITIAL_SIZE];

        size = 0;
    }

    /*public T listArray (int number) {
        if (number > size) {
            return null;
        } else {
            for (int i = 0; i < number; i++) {
                return (T) items[i];
            }
        }
        return ;
    }*/


    @Override
    public void add(T item) {
        items[size] = item;
        size++;
    }

    @Override
    public T get(int index) {
        if (index >= size) {

        return null;
        }

        return (T) items[index];
    }

    @Override
    public int getSize() {

        return size;
    }

    @Override
    public String getFullName(int index) {
        if (items[index] instanceof Person) {
            fullName = ((Person) items[index]).getFirstName() + " " + ((Person) items[index]).getLastName();
            //fullName = ((Person) item).firstName + ((Person) item).lastName;
        } else {
            if (items[index] instanceof Dog) {
                fullName = ((Dog) items[index]).name + " " + ((Dog) items[index]).breed;
            } else {
                fullName = "No name";
            }
        }

        return fullName;
    }

}
