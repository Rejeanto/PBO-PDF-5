package com.pboreg;

public class Main2 {
    int x = 5;

    public static void main(String[] args){
        Main2 myObj1 =  new Main2();
        Main2 myObj2 =  new Main2();
        myObj2.x = 25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
