package manyClassTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Branch1 branch1 = new Branch1();
        Branch2 branch2 = new Branch2();
        Branch3 branch3 = new Branch3();

        branch1.hamsu1_1();
        branch1.hamsu1_2();

        branch2.hamsu2_1(20);
        System.out.print("몇시간 잘건지 입력하시오: ");
        int sleep_time = branch2.hamsu2_2(scanner.nextInt());
        System.out.println(sleep_time + "시에는 자야합니다.");

        branch3.hamsu3_1(branch2);
    }
}
