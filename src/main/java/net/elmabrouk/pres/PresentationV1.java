package net.elmabrouk.pres;

import net.elmabrouk.ext.DaoImplV2;
import net.elmabrouk.metier.MetierImpl;

public class PresentationV1 {

    /*
    Injection des dépendances par instantiation statique
     */
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d); // Injection via le constructeur
        //metier.setDao(d); // Injection via le setter
        System.out.println("Res = " + metier.calculate());
    }
}
