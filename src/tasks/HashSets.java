package tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSets {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("PEar");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Fig");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");

        System.out.println(fruits.size());
        Set<String> uniqueFruits = new HashSet<>(fruits);

        for (String fruit : uniqueFruits) {
            System.out.println(fruit);
        }
        System.out.println(uniqueFruits.size());
    }

 /*
Create a ArrayList of fruits and add the to the list.
Apple, Pear, Banana, Apple, Cherry, Fig, Orange, Banana, Apple.
Print the size of this list.
Convert ArrayList items to HashSet.
Print what items are in the list.
Print the size of HashSet.

  */




}
