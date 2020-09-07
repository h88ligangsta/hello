package ru.mirea.inbo0319.vitikov;
import java.lang.*;
public class TestBall {
    public static void main(String[] args){
        Ball d1 = new Ball("Red", 15);
        Ball d2 = new Ball("Green", 18);
        Ball d3 = new Ball("White");
        d3.setRad(1);
        System.out.println(d1);
        d1.intoDiam();
        d2.intoDiam();
        d3.intoDiam();
    }
}