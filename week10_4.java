import java.util.ArrayList;

public class week10_4 {
    public static void main(String[] args) {
        System.out.println("x: B.Pranathi,24022");

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Papaya");

        fruits.add(1, "Orange");
        System.out.println("After adding: " + fruits);

        fruits.set(2, "Mango");
        System.out.println("After changing: " + fruits);

        String element = fruits.get(1);
        System.out.println("Element at index 1: " + element);

        fruits.remove(3);
        System.out.println("After removing: " + fruits);

        fruits.clear();
        System.out.println("After clearing: " + fruits);
    }
}
