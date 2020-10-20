package com.pboreg;

abstract class Main4 {
    public String fname = "John";
    public int age = 24;
    public abstract void study();
}

class Studen extends Main4{
    public int graduationYear = 2018;
    public void study(){
        System.out.println("Studying all day long");
    }
}

class Myclass{
    public static void main(String[] args){
        Studen myObj = new Studen();
        System.out.println("name : " + myObj.fname);
        System.out.println("age : " + myObj.age);
        System.out.println("graduationYear : " + myObj.graduationYear);
    }
}
