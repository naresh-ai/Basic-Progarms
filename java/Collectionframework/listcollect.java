package Collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listcollect {
    public static void main(String[] args) {


    List<String> ll=new ArrayList<>();
         ll.add("jkjk");
         ll.add("kjk");
        ll.add("ljlj");
        ll.add("jkj");
        ll.add("jkj");
        ll.add("jkh");
        ll.add("wrrr");
        ListIterator<String> li = ll.listIterator();
        while (li.hasNext()) {
            li.next();
        }
        System.out.println("The ArrayList elements in the reverse direction are: ");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }



    }
}
