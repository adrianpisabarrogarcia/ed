package refactorizar;

public class Cuenta {

    // Atributos o propiedades de la Clase Cuenta
    String nombre;
    String idcuenta;
    double Saldo;
    double TipoInterés;

    /* Constructor vacío */
    public Cuenta ()
    {
    }
    // Constructor con argumentos
    public Cuenta (String nom, String cue, double sal, double tipo, double tipoint)
    {
        nombre =nom;
        idcuenta=cue;
        Saldo=sal;
        TipoInterés=tipoint;
    }
    // Método para asignar el nombre del titular de la cuenta
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }

    // Método que me devuelve el nombre del titular
    public String obtenerNombre()
    {
        return nombre;
    }

    // Método que me devuelve el saldo disponible en cada momento
    public double Saldo ()
    {
        return Saldo;
    }

    // Método para ingresar cantidades en la cuenta. Modifica el saldo.
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        Saldo = Saldo + cantidad;
    }


    //Método para retirar cantidades en la cuenta. Modifica el saldo.
    public void Retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (Saldo()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        Saldo = Saldo - cantidad;
    }

    // Método que me devuelve el número de cuenta
    public String obtenerCuenta ()
    {
        return idcuenta;
    }
}
