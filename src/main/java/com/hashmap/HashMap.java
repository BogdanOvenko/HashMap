package com.hashmap;

public class HashMap implements Map<Integer, Long> {

    private Pair[] table;
    private float loadFactor = 0.75f;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 16;

    public HashMap() {
        table = new Pair[DEFAULT_CAPACITY];
    }

    public HashMap(int capacity) {
        if (capacity <= DEFAULT_CAPACITY) {
            table = new Pair[DEFAULT_CAPACITY];
        } else {
            table = new Pair[capacity];
        }
    }

    public Long put(Integer key, Long value) {

        int index = tableIndex(key);
        if (isTableFull()) {
            resize();
        }
        if (addInPosition(index, key, value) != null) {
            return addInPosition(index, key, value);
        }
        for (int i = index + 1; i != index; i++) {
            if (addInPosition(i, key, value) != null) {
                return addInPosition(i, key, value);
            }
        }
        return null;
    }

    public Long get(Integer key) {
        int index = tableIndex(key);
        if ( table[index] != null && table[index].getKey() == key) {
            return table[index].getValue();
        }
        for (int i = index + 1; i < table.length; i++) {
            if (table[index] != null && table[i].getValue() == key) {
                return table[i].getValue();
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

    private int tableIndex(Integer key) {
        return key.hashCode() % table.length;
    }
    private boolean isTableFull() {
        return size >= table.length * loadFactor;
    }

    private void resize() {
        Pair[] newTable = table;
        table = new Pair[table.length * 3 / 2 + 1];
        for (int i = 0; i < table.length; i++) {
            if (newTable[i] != null) {
                table[i] = new Pair(table[i].getKey(), table[i].getValue());
            }
        }
    }

    private Long addInPosition(int index, Integer key, Long value) {
        if (table[index] == null) {
            table[index] = new Pair(key, value);
            this.size++;
            return value;
        } else if (table[index].getKey() == key) {
            table[index] = new Pair(key, value);
            return value;
        }
        return null;
    }





}
