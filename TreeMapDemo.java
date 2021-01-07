package Datastructure;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    //数字升序排列
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>(new JiangXu());
        treeMap.put(40000, "xz");
        treeMap.put(30000, "xl");
        treeMap.put(50000, "xs");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
//反序比较器
class JiangXu implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

