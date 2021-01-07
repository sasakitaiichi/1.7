package Datastructure;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Beijing");
        set.add("London");
        set.add("Paris");
        System.out.println(set);

        //反序
        Set set1=((TreeSet<String>) set).descendingSet();
        System.out.println(set1);
    }
}
