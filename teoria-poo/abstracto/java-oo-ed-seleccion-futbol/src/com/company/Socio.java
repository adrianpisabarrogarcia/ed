package com.company;

import java.util.Scanner;

public class Socio extends SeleccionFutbol {
    Scanner entrada = new Scanner(System.in);
    private double dineroTotal;
    private double dineroComienzoCuenta;
    private double dineroInsertoCuenta;


    //Constructor

    public Socio(int id, String nombre, String apellidos, int edad, Scanner entrada, double dineroTotal, double dineroComienzoCuenta, double dineroInsertoCuenta) {
        super(id, nombre, apellidos, edad);
        this.entrada = entrada;
        this.dineroTotal = dineroTotal;
        this.dineroComienzoCuenta = dineroComienzoCuenta;
        this.dineroInsertoCuenta = dineroInsertoCuenta;
    }


    //getters & setters


    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public double getDineroTotal() {
        return dineroTotal;
    }

    public void setDineroTotal(double dineroTotal) {
        this.dineroTotal = dineroTotal;
    }

    public double getDineroComienzoCuenta() {
        return dineroComienzoCuenta;
    }

    public void setDineroComienzoCuenta(double dineroComienzoCuenta) {
        this.dineroComienzoCuenta = dineroComienzoCuenta;
    }

    public double getDineroInsertoCuenta() {
        return dineroInsertoCuenta;
    }

    public void setDineroInsertoCuenta(double dineroInsertoCuenta) {
        this.dineroInsertoCuenta = dineroInsertoCuenta;
    }

    //metodos
    public void insertarDineroEnCuenta(){
        System.out.println("Inserta con cuanta cantidad comienzas la cuenta");
        dineroComienzoCuenta= entrada.nextDouble();
        System.out.println("Inserta cuanto dinero quieres insertar");
        dineroInsertoCuenta= entrada.nextDouble();

        dineroTotal = dineroTotal + dineroComienzoCuenta + dineroInsertoCuenta;

        System.out.println("El dinero total de la cuenta actualmente es de: "+getDineroTotal());

    }



}
