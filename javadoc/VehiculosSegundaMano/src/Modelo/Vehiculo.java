package Modelo;

/**
 * <h1 style="color:orange;">Clase: Vehiculo</h1>
 * <b>En esta clase creo los atributos y metodos de la clase abstacta de coche y bicicleta</b>
 * @author Adriantxu
 * @version 1.0
 */



public abstract class  Vehiculo {




    private String marca;
    private int anios;
    private double precio;
    private String color;
    private final int plus = 300;

    //constructor vacío
    public Vehiculo() {
    }
    //constructor lleno
    public Vehiculo(String marca, int anios, double precio, String color) {
        this.marca = marca;
        this.anios = anios;
        this.precio = precio;
        this.color = color;
    }

    /**
     *
     * @return marca devolución
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca inserción
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return devolución años
     */
    public int getAnios() {
        return anios;
    }

    /**
     *
     * @param anios inserción años
     */
    public void setAnios(int anios) {
        this.anios = anios;
    }

    /**
     *
     * @return devolución precio
     * {@link Coche#plus(double)} dentro de Coche y Bicicleta
     */
    public double getPrecio() {
        return precio;
    }
    /**
     *
     * @param precio
     * {@link Coche#plus(double)} dentro de Coche y Bicicleta
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     *
     * @return devolución color
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color inserción color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return accede a {@link #plus} solamente.
     */
    public int getPlus() {
        return plus;
    }

}
