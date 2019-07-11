package com.nagappans.dsalgolab;

import com.nagappans.dsalgolab.linkedlist.DoublyLinkedList;

import java.util.HashMap;

/*
 * LRU Cache implementation - Least Recently Used Cache
 * Reference - https://www.interviewcake.com/concept/java/lru-cache
 */
public class LruCache<K,V> {

    private DoublyLinkedList<K, V> cacheTreeTraversal = new DoublyLinkedList<>();
    private HashMap<K, DoublyLinkedList.Node<K, V>> cacheMap = new HashMap<>();

    public LruCache() {

    }

    public void put(K name, V elem) {
        if (cacheMap.get(name)==null) {
            if (cacheTreeTraversal.isFull()) {
                DoublyLinkedList.Node<K, V> node = cacheTreeTraversal.removeNode();
                cacheMap.remove(node.getKey());
            }
            DoublyLinkedList.Node<K, V> node = cacheTreeTraversal.insertNode(name, elem);
            cacheMap.put(name, node) ;
        }
    }

    public V get(K name) {
        if (cacheMap.get(name) == null) {
            //get from db and insert into cache..
            return null;
        } else {
            DoublyLinkedList.Node<K, V> nodeValue = cacheMap.get(name);
            cacheTreeTraversal.moveNodeToHead(nodeValue);
            return nodeValue.getValue();
        }
    }

    public void evict() {

    }

}
