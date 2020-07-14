package com.company;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Ivan", "Ivanov", 22);
        Person p2 = new Person("Petr", "Petrov", 32);
        Person p3 = new Person("Georg", "Kustikov", 50);

        MyCollectionImpl<Person> persons = new MyCollectionImpl<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        for (int i = 0; i < persons.getSize(); i++) {
            //System.out.println(persons.get(i));
            System.out.println(persons.getFullName(i));
        }

        Dog d1 = new Dog("Bobik", "Russian greyhound");
        Dog d2 = new Dog("Zhuchka", "Komondor");
        Dog d3 = new Dog("Strelka", "Xoloitzcuintle");

       // MyCollectionApi<Dog> dogs = new MyCollectionImpl<>();
        MyCollectionImpl<Dog> dogs = new MyCollectionImpl<>();
        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);

        for (int i = 0; i < dogs.getSize(); i++) {
            //System.out.println(dogs.get(i));
            System.out.println(dogs.getFullName(i));
        }

        dogs.listArray(8);

    }
}
