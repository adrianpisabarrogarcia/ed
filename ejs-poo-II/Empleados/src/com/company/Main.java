package com.company;
import MisClases.*;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Creación Empleados: Repartidores *************************************\n");
        Repartidor r1 = new Repartidor("Endika",40,2500,"zona 3");
        Repartidor r2 = new Repartidor("Alaia",18,1200,"zona 1");
        Repartidor r3 = new Repartidor("Tania",40,1500.50,"zona 2");
        Repartidor r4 = new Repartidor("Adrián",18,2500,"zona 3");
        System.out.println(r1+" - Plus: "+r1.plus());
        System.out.println(r2+" - Plus: "+r2.plus());
        System.out.println(r3+" - Plus: "+r3.plus());
        System.out.println(r4+" - Plus: "+r4.plus());


        System.out.printf("Creación Empleados: Comerciales *************************************\n");
        Comercial c1 = new Comercial("Pepito",40,2500,0);
        Comercial c2 = new Comercial("Tarso",40,1200,300);
        Comercial c3 = new Comercial("Amaia",40,2000,200);
        Comercial c4 = new Comercial("Pepa",40,4000.60,300.59);
        System.out.println(c1+" - Plus: "+c1.plus());
        System.out.println(c2+" - Plus: "+c2.plus());
        System.out.println(c3+" - Plus: "+c3.plus());
        System.out.println(c4+" - Plus: "+c4.plus());

    }
}
