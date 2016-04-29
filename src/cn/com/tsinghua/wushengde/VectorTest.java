package cn.com.tsinghua.wushengde;

import java.util.Vector;

/**
 * Created by Administrator on 2016/4/13.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();
        strings.add(1,"hi");
        strings.add(2,"hello");
        strings.add(3,"world");

        System.out.println(strings.size());
        strings.get(1);
        strings.get(2);

    }


}
