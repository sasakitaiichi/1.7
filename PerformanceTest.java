package Datastructure;

import java.util.*;
import java.lang.Math;

public class PerformanceTest {
    static final int N = 50000;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        System.out.println("*******************hashset**************************");
        Collection<Integer> set1 = new HashSet<>(list);
        System.out.println("Member test time for hashset is " + getTestTime(set1) + " milliseconds");
        System.out.println("Remove test time for hashset is " + getRemoveTime(set1) + " milliseconds");

        //*******************LinkedHashset**************************
        System.out.println("*******************LinkedHashset**************************");
        Collection<Integer> linkedHashset = new LinkedHashSet<>(list);
        System.out.println("Member test time for linkedHashset is " + getTestTime(linkedHashset) + " milliseconds");
        System.out.println("Remove test time for linkedHashset is " + getRemoveTime(linkedHashset) + " milliseconds");

        //*******************TreeSet**************************
        System.out.println("*******************TreeSet**************************");
        Collection<Integer> treeSet = new TreeSet<>(list);
        System.out.println("Member test time for TreeSet is " + getTestTime(treeSet) + " milliseconds");
        System.out.println("Remove test time for TreeSet is " + getRemoveTime(treeSet) + " milliseconds");

        //*******************ArrayList**************************
        System.out.println("*******************ArrayList**************************");
        Collection<Integer> arraylist = new ArrayList<>(list);
        System.out.println("Member test time for ArrayList is " + getTestTime(arraylist) + " milliseconds");
        System.out.println("Remove test time for ArrayList is " + getRemoveTime(arraylist) + " milliseconds");

        //*******************LinkedList**************************
        System.out.println("*******************LinkedList**************************");
        Collection<Integer> linkedList = new LinkedList<>(list);
        System.out.println("Member test time for LinkedList is " + getTestTime(linkedList) + " milliseconds");
        System.out.println("Remove test time for LinkedList is " + getRemoveTime(linkedList) + " milliseconds");

    }

    public static long getTestTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) c.contains((int) (Math.random() * 2 * N));
        return System.currentTimeMillis() - startTime;
    }

    public static long getRemoveTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) c.remove(i);
        return System.currentTimeMillis() - startTime;
    }

}
