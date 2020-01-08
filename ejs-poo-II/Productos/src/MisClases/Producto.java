package MisClases;

public class Producto {
    //atributos
    private String nombre;
    private double precio;
    //constructores
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    //gettets & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //otros metodos
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
    public double precioFinal(int cantidad){
        return cantidad * getPrecio();
    }
}
