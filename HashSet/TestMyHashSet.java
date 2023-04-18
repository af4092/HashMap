package org.example.HashSet;

public class TestMyHashSet {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSet<>();
        set.add("Smith");
        set.add("John");
        set.add("Frank");
        set.add("July");

        System.out.println("Elements in set: " + set);
        System.out.println("Number of elements in set: " + set.size());
        System.out.println("Is Smith in set? " + set.contains("Smith"));

        set.remove("Smith");
        System.out.print("Names in set in uppercase are ");
        for(String s: set)
            System.out.print(s.toUpperCase() + " ");

        set.clear();
        System.out.println("\nElements in set after clearing: " + set);

    }
}
