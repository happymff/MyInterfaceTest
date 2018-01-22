package test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mengfeifei on 2018/1/22.
 */
public class CountAllLetters {
    public static void getcount(String str) {
        //String str = "2342asfghgyu56asdasda";
        Map<String, Integer> maps = new HashMap<String, Integer>();
        for (int i = 0; i < str.length(); i++) {
            String key = String.valueOf((str.charAt(i)));
            if (!maps.containsKey(key)) {
                maps.put(key, 1);
            } else {
                int val = maps.get(key);
                maps.put(key, val + 1);
            }
        }

        for (Map.Entry i : maps.entrySet()) {
            System.out.println(i.getKey() + "==" + i.getValue());
        }
    }

    public static void main(String[] args) {
        getcount("2342asfghgyu56asdasda");
    }

}
