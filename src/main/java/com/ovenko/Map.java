package com.ovenko;

/**
 * Created by Bogdan on 24.05.2017.
 */
public interface Map<K,V> {

    V put(K key, V value);
    V get(K key);

}
