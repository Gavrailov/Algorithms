// Definition: A sizeable array from the java.util package
// Use Case: When you need dynamic resizing or operations like inserting and deleting elements

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.remove("Banana"); // Remove an element
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
