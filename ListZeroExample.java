import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListZeroExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String car = scanner.next();
        List<String> inputList = Arrays.asList(car.split(","));

        System.out.println(inputList);
    }
}
