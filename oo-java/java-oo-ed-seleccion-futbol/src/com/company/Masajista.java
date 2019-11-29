package com.company;

public class Masajista extends SeleccionFutbol {
    private int anniosExperiencia;
    private String titulacion;

    //Constructores


    public Masajista(int id, String nombre, String apellidos, int edad, int anniosExperiencia, String titulacion) {
        super(id, nombre, apellidos, edad);
        this.anniosExperiencia = anniosExperiencia;
        this.titulacion = titulacion;
    }

    //Getters
    public int getAnniosExperiencia() {
        return anniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }


    //Setters
    public void setAnniosExperiencia(int anniosExperiencia) {
        this.anniosExperiencia = anniosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    //Otro metodos
    public void darMasaje(){
        System.out.println(getNombre()+" da masaje");
    }

}
