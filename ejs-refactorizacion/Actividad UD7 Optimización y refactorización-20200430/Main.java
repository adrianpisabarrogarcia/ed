package refactorizar;

public class Main {

    public static void main(String[] args) throws Exception {
        Cuenta DatosC;
        double saldoActual, saldoconinteres;

        DatosC = new Cuenta("Ekaitz","1234-5678-90-123456789",1000,0,0.02);
        try
        {
            DatosC.Retirar(230);
        } catch (Exception e)
        { System.out.print("Fallo al retirar");
        }

        try { System.out.println("Ingreso en cuenta");
            DatosC.ingresar(-695);
        } catch (Exception e)
        {
            System.out.print(e.toString());
        }

        saldoActual =  DatosC.Saldo();
        saldoconinteres = DatosC.Saldo() + DatosC.Saldo()*0.015;
        System.out.println("\n");
        System.out.println("El saldo actual es "+ saldoActual );
        System.out.println("El saldo actual con interés es " + saldoconinteres);
    }

}
