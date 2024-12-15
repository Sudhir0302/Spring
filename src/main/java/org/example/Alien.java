package org.example;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Computer com;
    public Alien(){
        System.out.println("Alien Object creation");
    }
    public Alien(int age){
        System.out.println("Para constructor");
//        this.age=age;
    }

//    @ConstructorProperties({"age","lap"})
//    public Alien(int age,Laptop lap){
//        this.age=age;
//        this.lap=lap;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("setter called");
        this.age = age;
    }

//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code()
    {
        System.out.println("coding");
        com.compile();
    }

}
