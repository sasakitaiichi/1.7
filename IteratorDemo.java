package Datastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("TaiBei");
        collection.add("NewYork");
        collection.add("Beijing");

        Iterator<String> iterator=collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toUpperCase());
        }
    }
}
