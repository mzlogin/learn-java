package org.mazhuang;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mazhuang
 * @date 2022/2/27
 */
public class SubListDemo {
    public static void main(String[] args) {
        int length = 10;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(i);
        }

        int subLength = 5;
        int fromIndex = 0;
        while (fromIndex < length) {
            int toIndex = Math.min(fromIndex + subLength, length);
            List<Integer> subList = list.subList(fromIndex, toIndex);
            doSomething(subList);
            fromIndex = toIndex;
        }
    }

    private static void doSomething(List<Integer> subList) {
        subList.forEach(System.out::println);
        subList.removeIf(v -> v == 1);
    }
}
