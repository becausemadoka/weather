package com.homura.study;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        
        String[] city=new String[]{"北京","北京","天津","上海","南京"};
        int[] temp=new int[]{55, 2, 3,4,5};

        Main m = new Main();
        String result = m.reporting(city, temp);
        System.out.println(result);
    }


    public String reporting(String[] positions, int[] datas) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < positions.length; i++) {
            if (hashMap.get(positions[i]) != null) {
                if (hashMap.get(positions[i]) < datas[i]) {
                    hashMap.put(positions[i], datas[i]);
                } else {
                    System.out.println("map中value值大,不进行放入操作");
                }
            } else {
                hashMap.put(positions[i], datas[i]);
            }
        }

        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        String text="";
        for (Map.Entry<String, Integer> entry : entries) {
            text = text + entry.getKey() + ":" + entry.getValue() + ",";
        }

        text = text.substring(0, text.length() - 1);
        return text;

    }
}
