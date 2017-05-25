package com.ovenko;

/**
 * Created by Bogdan on 24.05.2017.
 */
public class MainClass {

    public static void main(String[] args) {

        Map<Integer, Long> map = new HashMap<Integer, Long>();
        map.put(5, 89L);
        map.put(4, 56L);
        map.put(25, 5L);
        map.put(1, 533L);
        map.put(6, 24L);
        map.put(7, 11L);
        map.put(8, 75L);
        map.put(10, 1L);
        map.put(33, 1L);
        map.put(11, 2L);
        map.put(12, 1L);
        map.put(13, 1L);
        map.put(14, 1L);
        map.put(15, 1L);
        map.put(16, 1L);
        map.put(17, 1L);
        map.put(18, 1L);
        map.put(19, 1L);
        map.put(20, 1L);
        map.put(26, 2L);
        map.put(22, 1L);
        map.put(23, 1L);
        map.put(24, 1L);
        map.put(26, 1333L);
        map.put(27, 1L);
        map.put(2, 1L);
        map.put(26, 3L);
        map.put(30, 1L);

        System.out.println(map.get(2) + " " + map.size());
    }
}
