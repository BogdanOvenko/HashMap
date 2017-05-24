package com.ovenko;

/**
 * Created by Bogdan on 24.05.2017.
 */
public class Pair<K,V> {

    private final K key;
    private final V value;
    private boolean deleted;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
        this.deleted = false;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public boolean isDeleted(){
        return deleted;
    }
}
