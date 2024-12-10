// Definition: Fixed-size collection of elements of the same type
// Use Case: Storing a list of items when the size is known beforehand

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Declare and init. array
        for (int num : numbers) {
            System.out.println(num + (" alpha")); // print each element
        }
    }
}
