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
        map.put(6, 1L);

        System.out.println(map.get(1));
    }
}
