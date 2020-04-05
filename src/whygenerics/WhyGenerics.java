package whygenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class WhyGenerics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //ArrayList<Double> list = new ArrayList();
        list.add("Chau");
        list.add(20);
        list.add("Ha noi");
        list.add(8.5);
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
