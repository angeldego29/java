package com.mycompany.ejemploqueue;

import java.util.Queue;
import java.util.LinkedList;

public class Ejemploqueue {

    public static void main(String[] args) {
        Queue cola = new LinkedList();
        cola.add("juan");
        cola.add("maria");
        cola.add("pedro");

        System.out.println("sacando a..." + cola.remove());
        System.out.println("tamaño cola?..." + cola.size());
        System.out.println("cola vacia ??..." + cola.isEmpty());
        System.out.println("quien esta en la cola?" + cola);
        System.out.println("tamaño cola?..." + cola.size());
    }
}
