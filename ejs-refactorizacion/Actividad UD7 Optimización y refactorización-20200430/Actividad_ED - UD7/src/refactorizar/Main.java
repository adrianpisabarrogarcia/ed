package refactorizar;

public class Main {

    public static void main(String[] args) throws Exception {
        Cuenta datos;
        double saldoActual;
        double saldoInteres;
        //Variables globales
        final double INTERES = 0.015;

        datos = new Cuenta("Ekaitz","1234-5678-90-123456789",1000.0,0.02);

        try
        {
            datos.retirar(230);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            datos.ingresar(-695);
        } catch (Exception e)
        {
            System.out.print(e.toString());
        }

        saldoActual =  datos.getSaldo();
        saldoInteres = datos.getSaldo() + datos.getSaldo() * INTERES;
        System.out.println("\n");
        System.out.println("El saldo actual es :" + saldoActual );
        System.out.println("El saldo actual con interés es :" + saldoInteres);
    }

}
