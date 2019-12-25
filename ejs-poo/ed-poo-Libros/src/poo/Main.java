package poo;
import OtrasClases.*;

public class Main {

    public static void main(String[] args) {
        Libro l1 = new Libro("123456","Harry Potter", "Adriantxu",300);
        Libro l2 = new Libro("654321","Spiderman", "Enara",250);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println("\n\n");

        if (l2.getNumPaginas()>l1.getNumPaginas()){
            System.out.println("El libro: "+l2.getTitulo()+ " tiene más páginas: "+l2.getNumPaginas());
            System.out.println("y el libro: "+l1.getTitulo()+ " tiene menos páginas: "+l1.getNumPaginas());
        }else{
            System.out.println("El libro: "+l1.getTitulo()+ " tiene más páginas: "+l1.getNumPaginas());
            System.out.println("y el libro: "+l2.getTitulo()+ " tiene menos páginas: "+l2.getNumPaginas());
        }

    }
}
