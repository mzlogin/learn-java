package org.mazhuang;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mazhuang
 * @date 2022/2/27
 */
public class SubListDemo {
    public static void main(String[] args) {
        // 初始化 list 为 1, 2, 3, 4, 5
        List<Integer> list = new ArrayList<>();
        int len = 5;
        for (int i = 1; i <= len; i++) {
            list.add(i);
        }

        // 取前 3 个元素作为 subList，操作 subList
        List<Integer> subList = list.subList(0, 3);
        subList.add(6);

        System.out.println(list.size());

        list.remove(1);
        // java.util.ConcurrentModificationException
        System.out.println(subList);
    }
}
