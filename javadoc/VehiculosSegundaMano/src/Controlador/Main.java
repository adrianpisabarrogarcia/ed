package Controlador;

import Modelo.Bicicleta;
import Modelo.Coche;
import Modelo.Vehiculo;

/**
 * <h1 style="color:green;">Clase: Main</h1>
 * <b>En esta clase creo todos los objetos y los imprimo también ejecuto el metodo <i>plus</i> para comprobar si tiene que aplicar el método o no.</b>
 * @author Adriantxu
 * @version 1.0
 * <p>Algunas notas antes de revisar nada</p>
 *     <ul>
 *         <li>He decicido implementar los métodos {@link Coche#plus(double)} {@link Bicicleta#plus(double)} de otra manera, devolviendo el precio ya actualizado cuando llama al metodo toString() e imprimiendo true/false según si se aplica o no el plus.</li>
 *         <li>He decicido no poner en todos los getters y setters @link-s solo en algunos metodos.</li>
 *     </ul>
 *
 */

public class Main {

    public static void main(String[] args) {

        Coche c1 = new Coche("BMV",3,600,"azul",true);
        c1.plus(c1.getPrecio());
        System.out.println(c1.toString());

        Coche c2 = new Coche("Opel",7,100,"negro",false);
        c2.plus(c2.getPrecio());
        System.out.println(c2.toString());

        Bicicleta b1 = new Bicicleta("Atala",3,200,"negro",300);
        b1.plus(b1.getPrecio());
        System.out.println(b1.toString());

        Bicicleta b2 = new Bicicleta("BH",5,250,"gris",400);
        b2.plus(b2.getPrecio());
        System.out.println(b2.toString());



    }
}
