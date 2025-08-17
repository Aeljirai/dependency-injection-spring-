package net.elmabrouk.pres;

import net.elmabrouk.dao.IDao;
import net.elmabrouk.metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("config.txt"));
            String daoClassName = sc.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao dao =(IDao) cDao.getConstructor().newInstance();

            String metierClassName = sc.nextLine();
            Class cMetierClass = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetierClass.getConstructor().newInstance();
            Method setDao = cMetierClass.getMethod("setDao", IDao.class);
            setDao.invoke(metier, dao);
            System.out.println("Res = " + metier.calculate());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
