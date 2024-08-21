package Collectionframework;

import java.util.ArrayList;

public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
         names.add("nnan");
        names.add("nzj");
        names.add("axx");
        names.add("xadf");
        names.add("sdljf");

              for (String str :names){
                  System.out.println(str +"\t"+str.length());
                  StringBuffer br=new StringBuffer(str);
                  System.out.print(br.reverse());

              }

    }
}
