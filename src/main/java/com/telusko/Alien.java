package com.telusko;
import java.beans.ConstructorProperties;
public class Alien {
    private int age;
    private Computer com;

    public Alien() {
        System.out.println("Alien Object Created");
    }
//    @ConstructorProperties({"age","lap"})
//    public Alien(int age, Computer lap) {
//        this.age = age;
//        this.lap = lap;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding");
        com.compile();
    }
}
