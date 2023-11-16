package StreamProject.StreamTest;

import java.util.LinkedHashMap;
class Order {
    static int getTotalQunatityCount(LinkedHashMap<String, Integer> unverifiedOrders) {
        int totalQunatity = unverifiedOrders.values().stream()
                .mapToInt(Integer::intValue) // Integer 객체를 int로 변환하는 메서드 레퍼런스 (Java에서 제공하는 Integer 클래스의 'intValue' 메서드를 호출하여 해당 Integer 객체를 기본 타입인 int로 변환하는 역할)
                .sum();
        return totalQunatity;
    }
}
public class main {
    public static void main(String[] args) {
        // 간단한 주문 맵 생성
        LinkedHashMap<String, Integer> unverifiedOrders = new LinkedHashMap<>();
        unverifiedOrders.put("MUSHROOM_SOUP", 2);
        unverifiedOrders.put("T_BONE_STEAK", 1);
        unverifiedOrders.put("CHOCO_CAKE", 3);

        // getTotalQunatityCount 메서드 호출 및 결과 출력
        int totalQuantity = Order.getTotalQunatityCount(unverifiedOrders);
        System.out.println("Total Quantity: " + totalQuantity);
    }
}
