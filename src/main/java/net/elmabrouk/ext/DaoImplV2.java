package net.elmabrouk.ext;

import net.elmabrouk.dao.IDao;
import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version web service");
        double t = 11;
        return t;
    }
}
