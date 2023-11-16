import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleClear {
    public static void main(String[] args) {
        String[] fruitsArray = {"apple", "banana", "lemon"};
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(fruitsArray));
        System.out.println("before: " + fruits);
        fruits.clear();
        System.out.println("after: " + fruits);
    }

}
