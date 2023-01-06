package com.java.study.task3;

import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) {
        try {

            Class cl = Animal.class;
            Animal animal = new Animal();
            Field field = cl.getField("name");
            Field field1 = cl.getDeclaredField("age");
            Field field2 = cl.getDeclaredField("color");

            field.setAccessible(true);
            field1.setAccessible(true);
            field2.setAccessible(true);

            System.out.println("Public field value: " + field.get(animal));
            field.set(animal,"Rake");
            System.out.println("New field value: " + field.get(animal));
            System.out.println();

            System.out.println("Public field value: " + field1.getInt(animal));
            field1.set(animal,12);
            System.out.println("New field value: " + field1.getInt(animal));
            System.out.println();

            System.out.println("Private field2 value: " + field2.get(animal));
            field2.set(animal, "Black");
            System.out.println("New field2 value: " + field2.get(animal));

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
