package com.java.study.task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class cl = ReflectionTestClass.class;
        Field[] fields = cl.getFields();
        System.out.println("Public Reflection fields:");
        for (Field field: fields) {
            System.out.println("Fields name: " + field.getName());
            System.out.println("Fields type: " + field.getType());
        }
        System.out.println();
        Field[] declaredFields = cl.getDeclaredFields();
        System.out.println("All Modifiers Reflection fields: ");
        for (Field field: declaredFields) {
            System.out.println("Fields name: " + field.getName());
            System.out.println("Fields type: " + field.getType());
        }
        System.out.println();

        Constructor[] constructors = cl.getConstructors();
        int i = 0;
        for (Constructor constructor: constructors) {
            System.out.println("Constructors name: " + constructor.getName() + " number " + i++);
            Class<?>[] paramTypes = constructor.getParameterTypes();
            System.out.println();
            for (Class<?> paramType: paramTypes) {
                System.out.println("Constructor Parameter Types: " + paramType.getName());
            }
        }
        System.out.println();

        Method[] methods = cl.getMethods();
        for (Method method: methods) {
            System.out.println("Method name: " + method.getName());
            System.out.println("Return type: " + method.getReturnType());
            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.println();
            for (Class<?> paramType: paramTypes) {
                System.out.println("Method Parameter Types: " + paramType.getName());
            }
        }
    }
}
