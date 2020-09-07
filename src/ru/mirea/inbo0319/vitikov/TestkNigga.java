package ru.mirea.inbo0319.vitikov;
import java.lang.*;
public class TestkNigga {
    public static void main(String[] args){
        kNigga d1 = new kNigga("Education Book", 7);
        kNigga d2 = new kNigga("Mishkina Kasha", 3);
        kNigga d3 = new kNigga("Witcher");
        d3.setChapter(1);
        System.out.println(d1);
        d1.intoPage();
        d2.intoPage();
        d3.intoPage();
    }
}
