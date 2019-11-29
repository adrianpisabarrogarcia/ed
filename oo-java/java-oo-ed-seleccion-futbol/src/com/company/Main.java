package com.company;

import java.util.ArrayList;

public class Main {
    public static ArrayList<SeleccionFutbol> miembros = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {
        Entrenador mister = new Entrenador(123,"Michael","Mcanaman", 50,"A34");
        Masajista masajista1 = new Masajista(144,"Karl", "Jackson", 43,20, "Fisioterapéuta");
        Futbolista futbolista1 = new Futbolista(155, "Marta", "Sanchez", 55, 03, "A30");

        miembros.add(mister);
        miembros.add(masajista1);
        miembros.add(futbolista1);

        for (SeleccionFutbol miembro: miembros){
            System.out.println(miembro.getNombre()+"-->");
            miembro.concentrarse();
            System.out.println(miembro.getClass().toString());
            miembro.viajar();
        }

        futbolista1.entrenar();


    }
}
