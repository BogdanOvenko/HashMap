package com.hashmap;

public interface Map<K,V> {

    V put(K key, V value);
    V get(K key) throws Exception;
    int size();

}
