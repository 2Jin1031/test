package ExceptionTest;

public class Main {
    public static void main(String[] args) {
        int c;
        c = 4 / 1;
        if (c == 4) {
            try {
                throw new IllegalArgumentException("c는 4입니다.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
