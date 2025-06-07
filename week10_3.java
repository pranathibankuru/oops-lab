import java.util.Arrays;

public class week10_3 {
    public static void main(String[] args) {
        System.out.println("x: B.Pranathi,24022");

        Integer[] intArray = {15, 3, 6, 9, 2};
        System.out.println("Original Integer array: " + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("Sorted Integer array: " + Arrays.toString(intArray));

        String[] strArray = {"Wolf", "Mangostan", "lichi", "Cherry"};
        System.out.println("Original String array: " + Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("Sorted String array: " + Arrays.toString(strArray));

        String intArrayString = Arrays.toString(intArray);
        System.out.println("Integer array as a string: " + intArrayString);

        String strArrayString = Arrays.toString(strArray);
        System.out.println("String array as a string: " + strArrayString);

        Integer[] fillArray = new Integer[10];
        Arrays.fill(fillArray, 4);
        System.out.println("Array filled with 3: " + Arrays.toString(fillArray));

        Arrays.fill(fillArray, 4, 8, 6);
        System.out.println("Array filled: " + Arrays.toString(fillArray));

        Integer[] copiedArray = Arrays.copyOf(intArray, intArray.length);
        System.out.println("Copied Integer array: " + Arrays.toString(copiedArray));

        String[] copiedStrArray = Arrays.copyOf(strArray, strArray.length);
        System.out.println("Copied String array: " + Arrays.toString(copiedStrArray));
    }
}
