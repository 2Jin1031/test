import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String car = scanner.next();
        String[] carList = car.split(",");

        for (String value : carList) {
            System.out.println(value);
        }
    }
}
