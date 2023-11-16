package HashMapProject;

import java.util.HashMap;
import java.util.Map;

public class MapEntryExample {
    public static void main(String[] args) {
        // 예제 맵 생성
        Map<String, Integer> orderMap = new HashMap<>();
        orderMap.put("Pizza", 2);
        orderMap.put("Burger", 1);
        orderMap.put("Coke", 3);

        // 맵의 각 엔트리를 출력
        for (Map.Entry<String, Integer> entry : orderMap.entrySet()) {
            System.out.println("Item: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
