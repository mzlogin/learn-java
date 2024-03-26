package org.mazhuang;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mazhuang
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> outMap = new HashMap<>();
        Map<String, Integer> innerMap = new HashMap<>();
        innerMap.put("inner", 1);
        outMap.put("out", innerMap);

        Map.Entry<String, Integer> selectedEntry = null;
        for (Map.Entry<String, Map<String, Integer>> outEntry : outMap.entrySet()) {
            for (Map.Entry<String, Integer> entry : outEntry.getValue().entrySet()) {
                if (selectedEntry == null) {
                    selectedEntry = entry;
                    break;
                }
            }
        }

        if (selectedEntry != null) {
            selectedEntry.setValue(2);
        }

        System.out.println(outMap);
    }
}
