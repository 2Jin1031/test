import java.util.ArrayList;

public class SampleAdd {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        System.out.println(fruits); // [apple]
        fruits.add(0, "banana");
        System.out.println(fruits); // [banana, apple]
        fruits.add(0, "lemon");
        System.out.println(fruits); // [lemon, banana, apple]
    }
}

