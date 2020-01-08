package MisClases;

public class NoPerecedero extends Producto {
    //atributos
    private String tipo;
    //constructor
    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }
    //getters & setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //otros metodos

    @Override
    public String toString() {
        return "NoPerecedero{" +
                "nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() + '\'' +
                ", tipo='" + tipo +"'"+
                '}';
    }
    public double precioFinal(int cantidad){
        return cantidad * getPrecio();
    }
}
