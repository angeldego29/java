package com.mycompany.ejemploqueue;

import java.util.LinkedList;
import java.util.Random;
import java.util.Queue;

public class numaleatorios {

    public static void main(String[] args) {
        Random random = new Random();
        Queue cola = new LinkedList();
        int Aleatorio;
        for (int i = 1; i < 11; i++) {
            Aleatorio = random.nextInt(10);
            cola.add(Aleatorio);

        }
        System.out.println("NUMERO ALEATORIOS   " + cola);

    }
}
