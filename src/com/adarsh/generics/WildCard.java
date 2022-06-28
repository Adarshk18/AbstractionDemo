package com.adarsh.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCard<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 20;
    private int size = 0;

    public WildCard() {

        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list){

    }

    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length*2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {

        return size == data.length;
    }

    public T remove(){
        T removed = (T) (data[--size]);
        return removed;
    }

    public T get(int index){

        return (T) (data[index]);
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
        //ArrayList list = new ArrayList<>();
        //CustomGenArrayList list1 = new CustomGenArrayList();

        //list1.add(2);
        //list1.add(4);
        //for (int i=0; i<11; i++){
            //list1.add(2*i);

        //}
        //System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();//here <Integer> is Generics which helps us to write the variable type
        //list2.add("adarsh");
        //System.out.println(list2);

        WildCard<Integer> list3 = new WildCard<>();
        for (int i=0; i<14; i++){
           list3.add(2*i);
        }
        System.out.println(list3);
    }
}
