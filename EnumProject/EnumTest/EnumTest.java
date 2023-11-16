package EnumProject.EnumTest;

public class EnumTest {
    public static void main(String[] args) {
        // Enum 클래스의 values() 메서드 사용
        Color[] allColors = Color.values();

        // 모든 색상 출력
        System.out.println("All Colors:");
        for (Color color : allColors) {
            System.out.println(color);
        }
    }
}