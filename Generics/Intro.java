package Generics;

class Employee<T, V> {
    T id;
    V name;

    Employee(T id, V name) {
        this.id = id;
        this.name = name;
    }

}

class Animals {
    public <A> void test(A name) {
        System.out.println("this is name" + name);
    }
}

public class Intro {

    public static void main(String[] args) {
        // Employee<Integer, String> emp = new Employee<>(12, "John Doe");
        // System.out.println("ID->" + emp.id + "\nName->" + emp.name);

        Animals animal = new Animals();
        animal.test("Elephant");
    }
}
