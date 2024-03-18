package change;

public class String2Integer {


    public static void main(String[] args) {
        String str = "100j";
        try {
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            System.out.println("에러 발생");
        } finally {
            System.out.println("여기 까지 왔군");
        }
    }
}
