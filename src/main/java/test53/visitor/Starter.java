package test53.visitor;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 8/14/18
 * Time: 10:45 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Starter {

    /**
     * 引例
     * print1() 打印集合中的元素,
     * print2() 如果集合中任然是集合
     * print3() 如果给字符串添加引号, 给double追加D, float追加F
     */
    public void print1(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    // 如果collection中还是集合对象, 上边的it.next().toString()就没有意义了

    public void print2(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            if (o instanceof Collection) {
                print2((Collection)o);
            } else {
                System.out.println(o.toString());
            }
        }
    }

    // 如果需要打印字符串,加上单引号, 打印double,后边加上D,打印float后边加上F

    public void print3(Collection clt) {
        Iterator it = clt.iterator();
        while (it.hasNext()) {
            Object o  = it.next();
            if (o instanceof Collection) {
                print3((Collection)o);
            } else if (o instanceof String) {
                System.out.println("'" + o.toString() + "'");
            } else if (o instanceof Double) {
                System.out.println(o.toString() + "D");
            } else if (o instanceof Float) {
                System.out.println(o.toString() + "F");
            } else {
                System.out.println(o.toString());
            }
        }
    }

    // 条件越多, 分支越长, 代码越难维护, 考虑采用访问者模式
}
