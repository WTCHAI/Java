package org.example;

import org.example.models.Sandwich ;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sandwich sandwich1 = new Sandwich();
        Sandwich sandwich2 = new Sandwich("kuy");
        System.out.println("Hello hei");


        sandwich1.CreatingSandwhich("White bread", "Black bread", "Tomato source", 300);
        sandwich1.LogsSandwich();

        sandwich2.CreatingSandwhich("White bread", "Black bread", "Tomato source");

        sandwich2.LogsSandwich();
    }
}