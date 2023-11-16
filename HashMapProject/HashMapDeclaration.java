package HashMapProject;

import java.util.HashMap;

public class HashMapDeclaration {
    HashMap<String,String> map1 = new HashMap<String,String>(); // HashMap 생성
    HashMap<String,Integer> map2 = new HashMap<String,Integer>(); // key가 String, value가 Integer 형태
    HashMap<Integer,String> map3 = new HashMap<Integer,String>(); // key가 Integer, value가 String 형태
    HashMap<Integer,Integer> map4 = new HashMap<Integer,Integer>(); // key가 Integer, value가 Integer 형태

    HashMap<String,String> map5 = new HashMap<>(); // 파라미터 생략 가능

    HashMap<String,String> map6 = new HashMap<>(map1); // map1의 모든 값을 가진 HashMap 생성

    HashMap<String,String> map7 = new HashMap<String,String>(){{ //초기값 지정
        put("a","b");
    }};
}
