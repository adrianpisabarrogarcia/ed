package MisClases;

public class Comercial extends Empleado {
    //atributos
    private double comision;

    //constructor
    public Comercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    //getters & setters
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    //otros metodos
    @Override
    public String toString() {
        return "Comercial{" +
                "nombre='" + getNombre() + '\'' +
                "edad='" + getEdad() + '\'' +
                "salario='" + getSalario()+ '\'' +
                "comision=" + comision +
                '}';
    }

    public boolean plus(){
        if (getEdad()>30 && comision>200){
            return true;
        }else{
            return false;
        }
    }
}
