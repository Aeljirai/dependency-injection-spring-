package net.elmabrouk.metier;

import net.elmabrouk.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(@Qualifier("d2") IDao dao) {
        this.dao = dao;
    }
    public double calculate() {
        double t = this.dao.getData();
        double res = t * (double)23.0F;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
