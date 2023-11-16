import java.util.ArrayList;

public class ExceptionExample {
    public static void main(String[] args) {
        // 예외(Exceptions)

        ArrayList arrayList = new ArrayList(3);
       // arrayList.get(10);

        try {
            arrayList.get(10);
        } catch (IndexOutOfBoundsException ioe) {
            System.out.println("IndexOutOfBoundsException 발생");
        } catch(Exception e) {
            //e.printStackTrace();
            System.out.println("에러 발생");
        } finally {
            System.out.println("finally");
        }
    }
}

