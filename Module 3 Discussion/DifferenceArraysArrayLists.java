import java.util.ArrayList;
import java.util.Arrays;

public class DifferenceArraysArrayLists {

    public static void main(String[] args) {

        // 1. Declaration and Initialization
        // Arrays
        int[] intArray = new int[5]; // Fixed-size array
        String[] stringArray = {"Apple", "Banana", "Orange"};

        // ArrayLists
        ArrayList<Integer> intArrayList = new ArrayList<>(); // Dynamic size ArrayList
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));

        // 2. Adding Elements
        // Arrays
        intArray[0] = 10;
        intArray[1] = 20;

        // ArrayLists
        intArrayList.add(30);
        intArrayList.add(40);
        stringArrayList.add("Yellow");

        // 3. Accessing Elements
        // Arrays
        System.out.println("Element at index 0 in intArray: " + intArray[0]);

        // ArrayLists
        System.out.println("Element at index 1 in intArrayList: " + intArrayList.get(1));

        // 4. Size Flexibility
        // Arrays (Fixed size, need manual resizing)
        int[] resizedArray = Arrays.copyOf(intArray, intArray.length + 1);
        resizedArray[5] = 50;

        // ArrayLists (Dynamic size, automatically handles resizing)
        intArrayList.add(50);

        // 5. Data Type Constraint
        // Arrays
        // Cannot store primitive types directly in ArrayList, need to use wrapper classes
        // ArrayList<int> invalidList = new ArrayList<>(); // This line will result in a compilation error

        // ArrayLists
        // Only store objects
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(55);

        // 6. Printing Arrays and ArrayLists
        System.out.println("Elements in stringArray: " + Arrays.toString(stringArray));
        System.out.println("Elements in stringArrayList: " + stringArrayList);

        // Add more demonstrations as needed...

    }
}
