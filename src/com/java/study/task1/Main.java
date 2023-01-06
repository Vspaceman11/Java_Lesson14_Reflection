package com.java.study.task1;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Class reflectionClass = Reflection.class;
        Class reflection2Class = Reflection2.class;
        System.out.print("Enter Class name: ");
        String nameOfClass = input.next();
        try {
            if (nameOfClass.equals("reflectionClass")){
                System.out.println("Name of class: " + reflectionClass.getClass());
                System.out.println("Is Interface: " + reflectionClass.isInterface());
                System.out.println("Is Array: " + reflectionClass.isArray());
                System.out.println("Is Primitive: " + reflectionClass.isPrimitive());
                System.out.println("Package name: " + reflectionClass.getPackageName());
                System.out.println("Modifications: " + reflectionClass.getModifiers());

                Field[] fieldsClass = reflectionClass.getFields();
                for (Field field: fieldsClass) {
                    System.out.println("Class field: " + field.getName());
                    System.out.println("Class field type: " + field.getType());
                }
            }else if (nameOfClass.equals("reflection2Class")){
                System.out.println("Name of class: " + reflection2Class.getClass());
                System.out.println("Is Interface: " + reflection2Class.isInterface());
                System.out.println("Is Array: " + reflection2Class.isArray());
                System.out.println("Is Primitive: " + reflection2Class.isPrimitive());
                System.out.println("Package name: " + reflection2Class.getPackageName());
                System.out.println("Modifications: " + reflection2Class.getModifiers());

                Field[] fields2Class = reflection2Class.getFields();
                for (Field field: fields2Class) {
                    System.out.println("Class field: " + field.getName());
                    System.out.println("Class field type: " + field.getType());
                }
            }else {
                System.out.println("Entered name is incorrect.");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public class Reflection2{
        public double d = 12.5;

    }
    public class Reflection{
    public int i = 10;
    public String str = "Hello";

    }
}
