package test53.visitor.visitor2;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 1:49 PM
 * To change this template use File | Settings | File Templates.
 * Description: 机箱类
 */
public class Case extends Equipment {
    @Override
    public void accept(Visitor vls) {
        System.out.println("Case has been visited");
        vls.visitCase(this);
    }

    @Override
    public double price() {
        return 30.00;
    }
}
