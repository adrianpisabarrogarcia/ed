package OtrasClases;

import java.util.Scanner;

public class Cuenta {
    //Atributos
    private String titular;
    private double cantidad;

    //2 constructores
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    //Métodos Getters & Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    //Métodos toString
    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    //Otros métodos
    public void ingresar (double dinero){
        if(dinero>0) cantidad=cantidad+dinero;
    }

    public void retirar (double dinero){
        if(cantidad-dinero<0){cantidad=0;}
        else{cantidad= cantidad-dinero;}
    }
}
