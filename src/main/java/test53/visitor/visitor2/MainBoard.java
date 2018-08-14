package test53.visitor.visitor2;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 1:49 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class MainBoard extends Equipment {

    /**
     * 主板类
     */

    @Override
    public void accept(Visitor vls) {
        System.out.println("MainBoard has been visited");
        vls.visitMainBoard(this);
    }

    @Override
    public double price() {
        return 100.00;
    }
}
