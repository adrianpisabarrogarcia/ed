package com.company;
import MisClases.*;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Producto Productos[] =  new Producto[10]; //array de lista de productos
        DecimalFormat formato = new DecimalFormat("#.00"); //formato de dos decimales

        System.out.printf("Lista Perecederos **********************************\n");
        Productos[0] = new Perecedero("Crustáceos", 40,3);
        Productos[1] = new Perecedero("Moluscos", 50.6,2);
        Productos[2] = new Perecedero("Carne Picada", 5.99,3);
        Productos[3] = new Perecedero("Leche", 2,5);
        Productos[4] = new Perecedero("Mantequilla", 7.25,56);
        for (int i = 0; i < 5 ; i++) {
            System.out.println(Productos[i]);
        }

        System.out.printf("Lista No Perecederos **********************************\n");
        Productos[5] = new NoPerecedero("Atún", 3.5,"enlatado");
        Productos[6] = new NoPerecedero("Maiz", 1.5,"enlatado");
        Productos[7] = new NoPerecedero("Vegetales mixtos", 7.55,"enlatado");
        Productos[8] = new NoPerecedero("Azúcar", 6.25,"en cartón o plástico");
        Productos[9] = new NoPerecedero("Café", 3.99,"en cartón o plástico");
        for (int i = 5; i < 10 ; i++) {
            System.out.println(Productos[i]);
        }

        System.out.printf("\n\nCantidad de 5 en cada producto **********************************\n");
        for (int i = 0; i < Productos.length ; i++) {
            double precioTotal = Productos[i].precioFinal(5);
            System.out.println(Productos[i].getNombre()+" tiene un PRECIO TOTAL de "+formato.format(precioTotal)+"€");
        }


    }
}
