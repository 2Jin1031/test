public class CharToInteger {
    public static void main(String[] args) {

        // (1) 문자를 새로운 문자열 변수에 저장하고 숫자로 변환
        char ch2 = '2';
        String ch2str = String.valueOf(ch2);
        System.out.println(Integer.parseInt(ch2str)); // 2

        // (2) 문자 그대로 숫자로 반환
        System.out.println((int) ch2 - '0'); // 2

        // (3) 문자 타입을 문자열로 반환
        String ch1 = "1";
        System.out.println(Integer.parseInt(ch1)); // 1

    }
}
