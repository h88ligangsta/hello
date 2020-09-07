package ru.mirea.inbo0319.vitikov;
import java.lang.*;
public class kNigga {
    private String name;
    private int chapter;

    public kNigga(String n, int a){
        name=n;
        chapter=a;
    }
    public kNigga(String n){
        name =n;
        chapter=0;
    }
    public kNigga(){
        name = "Education Book";
        chapter = 0;
    }
    public void setChapter(int chapter){
        this.chapter = chapter;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(String name){
        return name;
    }
    public int getChapter(){
        return chapter;
    }
    public String toString(){
        return this.name+",chapter "+this.chapter;
    }
    public void intoPage(){
        System.out.println(name+"'s quantity page "+chapter*20+"pages");
    }

}