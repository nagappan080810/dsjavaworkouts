package com.nagappans.dsalgolab.linkedlist;

import java.util.HashMap;
import java.util.LinkedList;

public class PrintNoOfOccurences {

    public static <E> void printOccurences(LinkedList<E> list) {
        HashMap<E, Integer> countMap = new HashMap<>();
        while (!list.isEmpty()) {
            E element = list.poll();
            if (countMap.get(element)==null) {
                countMap.put(element, 1);
            } else {
                int cnt = countMap.get(element) + 1;
                countMap.put(element, cnt);
            }
        }

        for (HashMap.Entry<E, Integer> entry: countMap.entrySet()) {
            System.out.printf("%d %d\n", entry.getKey(), entry.getValue());
        }
    }
}
