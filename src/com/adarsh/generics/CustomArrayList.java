package com.adarsh.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 20;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length*2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {

        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        CustomArrayList list1 = new CustomArrayList();

        //list1.add(2);
        //list1.add(4);
        for (int i=0; i<11; i++){
            list1.add(2*i);

        }
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();//here <Integer> is Generics which helps us to write the variable type
        list2.add("adarsh");
        System.out.println(list2);
    }
}
