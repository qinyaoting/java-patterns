package test53.visitor.visitor2;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 1:49 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public abstract class Composite extends Equipment {

    private Vector parts = new Vector<>(10);

    public Composite(){}

    @Override
    public void accept(Visitor vls) {
        for (int i = 0; i < parts.size(); i++) {
            ((Equipment)parts.get(i)).accept(vls);
        }
    }

    @Override
    public double price() {
        double total = 0;
        for (int i = 0; i < parts.size(); i++) {
            total += ((Equipment)parts.get(i)).price();
        }
        return total;
    }

    public void add(Equipment e) {
        parts.add(e);
    }
}
