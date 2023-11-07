package ExceptionTest;

import java.util.Scanner;

public class Test1 {
    public void doAction() throws Exception {
        Scanner s = new Scanner(System.in);
        int inputNumber = s.nextInt();
        if(inputNumber ==1) {
            throw new Exception("input 1");
        }
        if(inputNumber == 2) {
            throw new Exception("input 2");
        }
        if(inputNumber == 3) {
            throw new Exception("사용자가 3을 입력했습니다.");
        }
        if(inputNumber == 4) {
            throw new IllegalArgumentException("사용자가 4를 입력했습니다.");
        }
    }

    public void doAction2() throws NumberFormatException {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        int number;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("올바른 숫자 형식이 아닙니다.");
        }
    }
}