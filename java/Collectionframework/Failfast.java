package Collectionframework;

import java.util.*;
import java.util.Iterator;

public class Failfast {
    public static void main(String[] args) {
        /*List<Integer>obj=new ArrayList<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        for( Integer s : obj){
            //s.add("TESTTT");
            System.out.println(s);
        }*/

        Map<String,Integer> obj1=new HashMap<>();
        obj1.put("omk",100);
        obj1.put("nanak",89);
        obj1.put("ok nana",78);




        Iterator<Map.Entry<String,Integer>> iterator = obj1.entrySet().iterator();
        while (iterator.hasNext()) {
            iterator.remove();
            Map.Entry<String,Integer > entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }



        }


    }

