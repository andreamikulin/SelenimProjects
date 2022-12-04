package Class08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorIntro {

    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.99);
        doubleList.add(5.56);
        doubleList.add(1.99);
        doubleList.add(107.87);
        doubleList.add(1103.00);
        doubleList.add(99.99);

        System.out.println("doubleList = " + doubleList);
        System.out.println("doubleList.get(2) = " + doubleList.get(2));

        System.out.println("-----For Loop-----");
        for (int i = 0; i < doubleList.size(); i++) {
            System.out.println(doubleList.get(i)); // or System.out.println(doubleList.get(i)).doubleValue(); (or .intValue() etc)
        }

        System.out.println("-----Enhanced Loop-----");
        for (double dList: doubleList){ // or Double with a capital - both work
            System.out.println(dList);
        }

        System.out.println("-----Iterator Loop-----");
        Iterator<Double> doubleIterator = doubleList.iterator();
        while (doubleIterator.hasNext()) {
            System.out.println(doubleIterator.next());
        }
    }
}
