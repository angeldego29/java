package com.mycompany.ejemploqueue;

import java.util.Queue;
import java.util.LinkedList;

public class imprimir10num {

    public static void main(String[] args) {
        Queue cola = new LinkedList();
        cola.add("1");
        cola.add("2");
        cola.add("3");
        cola.add("4");
        cola.add("5");
        cola.add("6");
        cola.add("7");
        cola.add("8");
        cola.add("9");
        cola.add("10");

        System.out.println("quien esta en la cola?" + cola);
    }
}
