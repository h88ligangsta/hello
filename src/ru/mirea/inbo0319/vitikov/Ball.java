package ru.mirea.inbo0319.vitikov;
import java.lang.*;
public class Ball {
    private String color;
    private int rad;

    public Ball(String c, int r){
        color=c;
        rad=r;
    }
    public Ball(String c){
        color=c;
        rad=0;
    }
    public Ball(){
        color="Green";
        rad = 0;
    }
    public void setRad(int rad){
        this.rad=rad;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(String color){
        return color;
    }
    public int getRad(){
        return rad;
    }
    public String toString(){
        return this.color+",rad "+this.rad;
    }
    public void intoDiam(){
        System.out.println(color+"'s Diameter is "+rad*2+"sm");
    }

}