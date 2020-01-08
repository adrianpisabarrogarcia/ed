package MisClases;

public class Repartidor extends Empleado {
    //atributos
    private String zona;

    //constructor
    public Repartidor(String nombre, int edad, double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    //getters & setters
    public String getZona() {
        return zona;
    }
    public void setZona(String zona) {
        this.zona = zona;
    }

    //otros metodos
    @Override
    public String toString() {
        return "Repartidor{" +
                "nombre='" + getNombre() + '\'' +
                "edad='" + getEdad() + '\'' +
                "salario='" + getSalario()+ '\'' +
                "zona='" + zona +
                '}';
    }

    public boolean plus(){
        if (getEdad()<25 && zona.equalsIgnoreCase("zona 3")){
            return true;
        }else{
            return false;
        }
    }
}
