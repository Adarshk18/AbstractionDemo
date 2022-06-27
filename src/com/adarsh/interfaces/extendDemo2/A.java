package com.adarsh.interfaces.extendDemo2;

public interface A {

    static void greeting(){
        System.out.println("Hey I m static method");
    }

    default void fun(){
        System.out.println("I m in A");
    }
}
