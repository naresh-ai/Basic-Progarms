package Collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Failfastiterator {
    public static void main(String[] args)
    {


       /* List<String> obj = new ArrayList<>();
        obj.add("nana");
        obj.add("ok");
        obj.add("rock");
        obj.add("rowdy");
        Iterator<String> a =


        Iterator<String> iterator =obj.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
        }

*/
        //List<String> list =  new ArrayList<>();
        ArrayList<String> nana=new ArrayList<>();
        nana.add("jh");

        nana.add("Test");
        nana.add("Java");
        nana.add("AVSSS");
        nana.add("OUUU");
        nana.add("NMMMM");

        Iterator<String> iterator = nana.iterator();
        while (iterator.hasNext()){

            String temp = iterator.next();
            nana.set(2,"eama");

            System.out.println(temp);
            iterator.remove();


           // iterator.equals(iterator.next());
        }
        System.out.println(nana);
    }
}
