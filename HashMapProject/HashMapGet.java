package HashMapProject;

import java.util.HashMap;

public class HashMapGet {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>(){{ //초기값 지정
            put(2023,"사과");
            put(11,"바나나");
            put(2,"포도");
        }};

        System.out.println(map); // {2=포도, 2023=사과, 11=바나나} <- hashMap은 입력 순서를 보장하지 않는다

        System.out.println(map.get(11)); // key 값이 11인 value -> 바나나
        System.out.println(map.get(2023)); // key 값이 2023인 value -> 사과

    }
}
