package com.company;

public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String posicion;

    //Constructores

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String posicion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }


    //Getters

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }


    //Setters

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }


    //Otro metodos
    public void jugarPartido(){
        System.out.println(getNombre()+" jugar el partido");
    }

    public void entrenar(){
        System.out.println(getNombre()+" entrena");
    }

}
