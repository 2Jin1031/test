import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class SplitTest {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        String input = "해산물파스타-2a";
        LinkedHashMap<String, Integer> orderAll = new LinkedHashMap<>();
        try {
            String[] inputs = input.split(",");
            for (String entry : inputs) {
                String[] keyValue = entry.split("-");
                if (keyValue.length == 2) {  // 예외 처리 하기
                    String key = keyValue[0]; // String 아닐 경우 예외 처리 하기
                    int value = Integer.parseInt(keyValue[1]); // Integer 아닐 경우 예외 처리 하기
                    orderAll.put(key, value);
                }
                else {
                    throw new IllegalArgumentException("not 2");
                }
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("orderTypeError"); // 에러 메시지 작성
        }
    }

}
