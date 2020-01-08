package MisClases;

public class Perecedero extends Producto {
    //atributos
    private int diasACaducar;
    //constructores
    public Perecedero(String nombre, double precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }
    //Getters & Setters
    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }
    //Otros métodos

    @Override
    public String toString() {
        return "Perecedero{" +
                "nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", diasACaducar=" + diasACaducar +
                '}';
    }
    public double precioFinal (int cantidad){
        if (diasACaducar==1) {
            return (getPrecio()*cantidad)/4;
        }else if (diasACaducar==2){
            return (getPrecio()*cantidad)/3;
        }else if (diasACaducar==3){
            return (getPrecio()*cantidad)/2;
        }else {
            return getPrecio()*cantidad;
        }
    }
}
