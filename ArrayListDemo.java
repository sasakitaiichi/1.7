package Datastructure;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arraylist = new ArrayList<>();
        arraylist.add("a");
        arraylist.add("b");
        arraylist.add("c");
        arraylist.add(0, "a1");

        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
        arraylist.remove(0);
        System.out.println(arraylist);

        arraylist.remove("c");
        System.out.println(arraylist);

        arraylist.clear();
        System.out.println(arraylist);
    }



    private static void showGreaterThan100() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(101);
        integerList.add(55);
        integerList.add(2000);
        integerList.add(1);
        integerList.add(300);

        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) < 100) {
                integerList.remove(i);
            }
        }
        System.out.println(integerList);

    }
}
