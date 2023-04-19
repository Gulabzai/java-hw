package project2;

import java.util.HashSet;

public class H10 {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "orange", "apple", "pear", "banana"};

        // Create a HashSet to store unique elements
        HashSet<String> set = new HashSet<String>();

        // Create a HashSet to store duplicate elements
        HashSet<String> duplicates = new HashSet<String>();

        // Loop through the array and check for duplicates
        for (String str : arr) {
            if (!set.add(str)) {
                duplicates.add(str);
            }
        }

        System.out.println("Duplicate elements in the array are: " + duplicates);
    }
}
