import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("이진", "2");
        map.put("정수미", "1");
        System.out.println(map.get(2)); // "사람" 출력
    }
}
