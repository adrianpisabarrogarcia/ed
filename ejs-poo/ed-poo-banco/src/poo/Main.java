package poo;
import OtrasClases.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Cuentas creadas: ****************************************");
        Cuenta c1 = new Cuenta("Pepe Montalvo", 100);
        System.out.println(c1);
        Cuenta c2 = new Cuenta("Ainhoa Margarita", 150.6);
        System.out.println(c2);
        Cuenta c3 = new Cuenta("Roberto Pinilla", 0.5);
        System.out.println(c3);


        //Movimientos Ingresar
        c1.ingresar(500);
        c2.ingresar(-50);
        c3.retirar(6);
        c1.retirar(2);


        System.out.println("\n\nResultado de cuentas tras movimientos: ****************************************");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
