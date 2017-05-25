package com.ovenko;

/**
 * Created by Bogdan on 23.05.2017.
 */
public class HashMap<K,V> implements Map<K,V>{

    private Pair<K,V>[] table;
    private float loadFactor = 0.75f;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 16;

    public HashMap() {
        table = new Pair[DEFAULT_CAPACITY];
    }

    public HashMap(int capacity) {
        if(capacity <= DEFAULT_CAPACITY){
            table = new Pair[DEFAULT_CAPACITY];
        } else {
        table = new Pair[capacity];
        }
    }

    public V put(K key, V value) {
        V thisValue;
        int index = tableIndex(key);
        if(isTableFull()){this.table = resize(table);}
        if ((thisValue = addInPosition(index, key, value)) != null){
            return thisValue;
        }
        for (int i = index + 1 ; i != index; i++) {
            if ((thisValue = addInPosition(i, key, value)) != null){
                return thisValue;
            }
        }
        return null;
    }
    private V addInPosition(int index, K key, V value){
        if (table[index] == null) {
            table[index] = new Pair<K, V>(key, value);
            this.size++;
            return value;
        }else if(table[index].getKey() == key){
            table[index] = new Pair<K, V>(key, value);
            return value;
        }
        return null;
    }

    public V get(K key) {
        int index = tableIndex(key);
        try{
            if (table[index].getKey() == key && !table[index].isDeleted()) {
                return table[index].getValue();
            }
            for (int i = index + 1; i != index; i++) {
                if(table[i].getValue() == key && !table[i].isDeleted()) {
                    return table[i].getValue();
                }
            }
            return null;
        }catch(NullPointerException e){
            return null;
        }
    }

    private Pair<K,V>[] resize(Pair<K,V>[] table){
        Pair[] newTable = new Pair[table.length * 3/2 + 1];
        for(int i = 0; i < table.length; i++) {
            if(table[i] != null) {
                newTable[i] = new Pair<K,V>(table[i].getKey(), table[i].getValue());
            }
        }
        return newTable;
    }



    private boolean isTableFull(){
        return size >= table.length * loadFactor;
    }

    private int tableIndex(K key){
        return key.hashCode() % table.length;
    }

    public int size(){
        return size;
    }
}
