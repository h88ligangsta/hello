package ru.mirea.inbo0319.vitikov;
import java.lang.*;
public class TestDog {
    public static void main(String[] args){
        Dog d1 = new Dog("Sanya", 2);
        Dog d2 = new Dog("Anton", 7);
        Dog d3 = new Dog("Petyan");
d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
