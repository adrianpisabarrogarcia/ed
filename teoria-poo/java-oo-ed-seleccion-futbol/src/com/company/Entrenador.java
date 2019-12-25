package com.company;

public class Entrenador extends SeleccionFutbol {
    private String idFederacion;

    //Constructores

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    //Getters

    public String getIdFederacion() {
        return idFederacion;
    }


    //Setters

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    //Otro metodos
    public void dirigirPartido(){
        System.out.println(getNombre()+" dirige el partido");
    }

    public void dirgirEntreno(){
        System.out.println(getNombre()+" dirige el entreno");
    }

}
