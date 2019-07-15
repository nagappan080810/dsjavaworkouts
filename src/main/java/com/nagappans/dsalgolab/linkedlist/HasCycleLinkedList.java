package com.nagappans.dsalgolab.linkedlist;

import java.util.HashSet;
import java.util.Iterator;

public class HasCycleLinkedList {

    public static<T> boolean hasCycle(LinkedList<T> list) {
        HashSet<T> poppedIntegerElements = new HashSet<>();
        T element = list.poll();

        while(element!=null) {
            if (!poppedIntegerElements.add(element)) {
                return true;
            }
            element = list.poll();
        }
        return false;
    }

    public static<T> boolean hasCycleByFloydsAlgorithm(LinkedList<T> list) {
        Iterator<T> singleIterator = list.iterator();
        Iterator<T> doubleIterator = list.iterator();
        while(singleIterator.hasNext() && doubleIterator.hasNext()) {
            doubleIterator.next();
            if (doubleIterator.next()==singleIterator.next()) {
                return true;
            }
        }
        return false;
    }
}
