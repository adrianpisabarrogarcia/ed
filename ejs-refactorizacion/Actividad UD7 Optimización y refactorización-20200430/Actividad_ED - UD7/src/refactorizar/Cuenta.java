package refactorizar;

public class Cuenta {

    // Atributos o propiedades de la clase Cuenta
    String nombre;
    String idCuenta;
    double saldo;
    double tipoInteres;

    // Constructor vacío
    public Cuenta() {
    }

    // Constructor con argumentos
    public Cuenta(String nombre, String idCuenta, double saldo, double tipoInteres) {
        this.nombre = nombre;
        this.idCuenta = idCuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    // Método para asignar el nombre del titular de la cuenta
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método que me devuelve el nombre del titular
    public String getNombre() {
        return nombre;
    }

    // Método que me devuelve el saldo disponible en cada momento
    public double getSaldo() {
        return saldo;
    }


    // Método para ingresar cantidades en la cuenta. Modifica el saldo.
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    // Método que me devuelve el número de cuenta
    public String getIdCuenta() {
        return idCuenta;
    }


    //Método para retirar cantidades en la cuenta. Modifica el saldo.
    public void retirar (double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getSaldo() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }
}



