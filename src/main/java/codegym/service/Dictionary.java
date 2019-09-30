package codegym.service;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private static Map<String,String> dic;
    static {
        dic = new HashMap<>();
        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");
    }
    public String search(String word) {
        String result = dic.get(word);
        if(result != null){return result;}
        else return "not found";
    }
}
