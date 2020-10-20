package com.pboreg;

public class Main5 {
    int model;
    String modelname;

    public Main5(int year, String name){
        model = year;
        modelname = name;
    }

    public static void main(String[] args){
        Main5 myCar = new Main5(1964, "mustang");
        System.out.println(myCar.model + " " + myCar.modelname);
    }
}
