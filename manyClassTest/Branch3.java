package manyClassTest;

class NoExistenceTimeException extends Exception {
}
public class Branch3 {

    public void hamsu3_1(Branch2 branch2) {
        int time = branch2.hamsu2_2(10);
        try {
            if (time <= 0) {
                throw new NoExistenceTimeException();
            }
            System.out.println(time + "에 자는 건 말이 안되긴 해");
        } catch (NoExistenceTimeException e) {
            System.out.println("12시 이전이라 절대 불가능하다 삐빅");
        }
    }
}
