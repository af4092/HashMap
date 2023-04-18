package org.example.HashMap;

public class TestMyHashMap {
    public static void main(String[] args) {
        MyMap<String, Integer> map = new MyHashMap<>();
        map.put("Frank", 30);
        map.put("John", 32);
        map.put("Lucy", 23);

        System.out.println("Entries in map: " + map);
        System.out.println("The age for Frank is " + map.get("Frank"));
        System.out.println("Is Smith in the map? " + map.containsKey("Smith"));
        map.remove("Lucy");
        System.out.println("Entries in map after removing Lucy: " + map);
        map.clear();
        System.out.println("Entries in map after CLEAR: " + map);
    }
}
