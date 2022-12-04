package Class08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {
        List randomList = new ArrayList<>();
        randomList.add("Apple");
        randomList.add("Orange");
        randomList.add(20);
        randomList.add(97.78);
        randomList.add(2==3);
        randomList.add('C');


        System.out.println("randomList = " + randomList);

        System.out.println("-----For Loop-----");
        for (int i = 0; i < randomList.size(); i++) {
            System.out.print(randomList.get(i) + "  ");
        }

        System.out.println("\n-----Enhanced Loop-----");
        for (Object item : randomList) {
            System.out.print(item + "  ");
        }

        System.out.println("\n-----Iterator-----");
        Iterator iterator = randomList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }
        
        
    }
}
