package com.adarsh.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Daughter daughter = new Daughter(25);
        daughter.career();

        Parent mom = new Parent(42) {
            @Override
            void career() {

            }

            @Override
            void partner() {

            }
        };
    }
}
