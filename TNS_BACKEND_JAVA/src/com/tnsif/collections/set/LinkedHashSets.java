package com.tnsif.collections.set;
import java.util.LinkedHashSet;

public class LinkedHashSets{
    public static void main(String[] args) {

        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); 
        set.add(40);

        System.out.println("LinkedHashSet elements:");
        for (Integer num : set) {
            System.out.println(num);
        }
        set.remove(30);

        System.out.println("After removing 30:");
        System.out.println(set);

       
        System.out.println("Contains 20 " + set.contains(20));
    }
}
