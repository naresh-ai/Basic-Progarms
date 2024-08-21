package Collectionframework;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class set {


        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(10);
            list.add(40);
            list.add(10);
            list.add(20);
            list.add(10);
            list.add(40);

            System.out.println(list.size() + " Printing List elements "+list); //8
            list.remove(5);
            System.out.println(list.size() + " Printing List elements "+list);//7



            Set<Integer> set = new HashSet<>();
            set.add(10);
            set.add(20);
             set.add(10);
            set.add(40);
            System.out.println("Printing set elements "+set);
        }
    }

