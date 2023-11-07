package ExceptionTest;

public class ExecClass {
    public static void main(String[] args) {
        try {
            Test1 test1 = new Test1();
            test1.doAction();
        } catch (Exception e) {
            if (e.getMessage().equals("input 1")) {
                System.out.println("사용자가 1을 입력했습니다.");
            }
            if (e.getMessage().equals("input 2")) {
                System.out.println("사용자가 2을 입력했습니다.");
            }
            if (e.getMessage().equals("사용자가 3을 입력했습니다.")) {
                System.out.println(e.getMessage());
            }
            if (e.getMessage().equals("사용자가 4를 입력했습니다.")) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Test1 test1 = new Test1();
            test1.doAction2();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}