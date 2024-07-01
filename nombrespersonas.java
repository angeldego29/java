package com.mycompany.ejemploqueue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class nombrespersonas {

    public static void main(String[] args) {
        Queue cola = new LinkedList();

        Scanner teclado = new Scanner(System.in);

        int opcion = 0;
        String Nombre;
        do {
            System.out.println("1.- registrar");
            System.out.println("2.- sacar");
            System.out.println("3.- mostar");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("ingrese el nombre");
                    Nombre = teclado.next();
                    cola.add(Nombre);
                    System.out.println("nombre agregao ala cola");
                    System.out.println(cola);
                    break;

                case 2:
                    System.out.println(cola.remove());
                    break;
                case 3:
                    System.out.println(cola);
                    break;
            }

        } while (opcion != 4);

    }
}
