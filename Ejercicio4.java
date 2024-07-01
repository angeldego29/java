package com.mycompany.ejemploqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4 {

    public static void main(String[] args) {
        Queue cola = new LinkedList();
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 10 + 1);
            if (cola.contains(num)) {
                i--;
            } else {
                cola.add(num);
            }
        }
        System.out.println(cola);
    }
}
