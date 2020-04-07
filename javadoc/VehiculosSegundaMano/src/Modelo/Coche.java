package Modelo;

/**
 * <h1 style="color:red;">Clase: Coche</h1>
 * <b>En esta clase creo los atributos y metodos de la clase coche</b>
 * @author Adriantxu
 * @version 1.0
 */


public class Coche extends Vehiculo {
    private boolean hibido;

    //constructor vacío y heredado
    public Coche(boolean hibido) {
        this.hibido = hibido;
    }

    //constructor lleno y heredado
    public Coche(String marca, int anios, double precio, String color, boolean hibido) {
        super(marca, anios, precio, color);
        this.hibido = hibido;
    }

    /**
     *
     * @return devuevlo hibdrido
     */
    public boolean isHibido() {
        return hibido;
    }

    /**
     *
     * @param hibido inserto
     */
    public void setHibido(boolean hibido) {
        this.hibido = hibido;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "hibido=" + hibido + " marca=" +getMarca()+ " años="+ getAnios()+ " precio="+getPrecio()+" color="+getColor()+"}";
    }

    /**
     *
     * @param precio - creo una variable precio para modificarla dentro del programa
     */
    public void plus(double precio){
        boolean estado = false;
        if (hibido=true && getAnios()<5) {
            precio = getPlus() + getPrecio();
            estado = true;
        }
        setPrecio(precio);
        System.out.print("¿se ha aplicado el plus?: ");
        System.out.println(estado);
    }


}
