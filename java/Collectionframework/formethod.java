package Collectionframework;

import java.util.ArrayList;
import java.util.List;

public class formethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Test");
        list.add("Java");
        list.add("AVSSS");
        list.add("OUUU");
        list.add("NMMMM");

        for (String s : list) {
            list.add("TESTTT");
            System.out.println(s);
        }
    }
}
