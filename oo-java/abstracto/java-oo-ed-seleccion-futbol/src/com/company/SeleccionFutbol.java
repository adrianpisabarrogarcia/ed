package com.company;

public class SeleccionFutbol {
    //Atributos de la clase
    protected  int id;
    protected  String nombre;
    protected  String apellidos;
    protected  int edad;

    //1. Constructores
    public SeleccionFutbol(){};

    public SeleccionFutbol (int id, String nombre, String apellidos, int edad){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;

    }


    //2. Getters --> para poder acceder a los atributos.
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }


    //3. Setters --> para darle un valor a un de los atributos, para que el usuario pueda modificar.
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //4. Otros métodos
    public void concentrarse(){
        System.out.println(getNombre()+" se concentra");
    }

    public void viajar(){
        System.out.println(getNombre()+" viaja");
    }

}
