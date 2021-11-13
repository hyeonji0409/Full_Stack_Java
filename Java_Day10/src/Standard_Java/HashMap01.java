package Standard_Java;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String >();

        // 원소를 추가하는 경우(put)
        map.put("first", "김준면");
        map.put("second", "김민석");

        // 원소를 확인하는 방법(get)
        System.out.println(map.get("first"));

        // 전체 원소를 확인하려면
        System.out.println(map.entrySet());

        // for each
        for(Map.Entry<String, String> item: map.entrySet()){
            System.out.printf("key: %s, value: %s\n", item.getKey(), item.getValue());
        }

        // 키만 확인
        System.out.println(map.keySet());

        for(String key: map.keySet()) {
            System.out.println(map.get(key));
        }

        // 원소를 삭제하는 경우(remove)
        // 키에 해당하는 원소를 삭제하면 해당 값 돌려줌
        System.out.println(map.remove("first"));

        // 크기 확인(size)
        System.out.println(map.size());
    }
}
