package Collectionframework;

import java.util.concurrent.ConcurrentHashMap;

public class Concurrentmap {
    static {
        System.out.println("Hello");
    }
    public static void main(String[] args) {

        ConcurrentHashMap <Integer,String> obj=new ConcurrentHashMap<>();
        obj.put(1,"Naresh");
        obj.put(2,"Omkar");
        obj.put(3,"Manoj");
        obj.put(4,"Gaurav");
        System.out.print(obj);


        



    }
}
