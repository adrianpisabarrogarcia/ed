package Modelo;


/**
 * <h1 style="color:red;">Clase: Bicicleta</h1>
 * <b>En esta clase creo los atributos y metodos de la clase bicicleta</b>
 * @author Adriantxu
 * @version 1.0
 */

public class Bicicleta extends Vehiculo {
    private double cilindrada;

    //constructor vacío y heredado
    public Bicicleta(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    //constructor lleno y heredado
    public Bicicleta(String marca, int anios, double precio, String color, double cilindrada) {
        super(marca, anios, precio, color);
        this.cilindrada = cilindrada;
    }

    /**
     * @return devuelve cilindrada
     */
    public double getCilindrada() {
        return cilindrada;
    }

    /**
     * @param cilindrada inserta
     */
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "cilindrada=" + cilindrada + " marca=" +getMarca()+ " años="+ getAnios()+ " precio="+getPrecio()+" color="+getColor()+"}";
    }

    /**
     * @param precio - creo una variable precio para modificarla dentro del programa
     */
    public void plus(double precio){
        boolean estado = false;
        if (cilindrada>=250 && getAnios()<4) {
            precio = getPlus() + getPrecio();
            estado = true;
        }
        setPrecio(precio);
        System.out.print("¿se ha aplicado el plus?: ");
        System.out.println(estado);
    }
}
