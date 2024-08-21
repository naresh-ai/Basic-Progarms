package Collectionframework;


import java.util.ArrayList;
import java.util.List;

public class Iterator {

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(100);//0
            list.add(200);//1
            list.add(300);//2
            list.add(400);//3
            list.add(500);//4

/*
        //for loop
        for(int i = 2; i < list.size(); i++){
            System.out.println("using for loop "+list.get(i));
        }
        //enhanced for loop
        for(Integer a : list){
            System.out.println("using enhanced for loop "+a);
        }
*/

            List<String> listString = new ArrayList<>();
            listString.add("A");//0
            listString.add("B");//1
            listString.add("C");//2
            listString.add("D");//3
            listString.add("E");//4

            for(String ss : listString){
                System.out.println("using enhanced for loop "+ss);
            }

        }
    }


