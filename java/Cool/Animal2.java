package Cool;

import java.util.ArrayList;
import java.util.List;

public class Animal2 {
    public static void main(String[] args) {
        Animal aa=new Animal(1,"naa","jkj");
        Animal aa1=new Animal(1,"naa","jkj");
        Animal aa2=new Animal(1,"naa","jkj");
        Animal aa3=new Animal(1,"naa","jkj");

        List<Animal> com=new ArrayList<>();
        com.add(aa);
        com.add(aa1);
        com.add(aa2);
        com.add(aa3);

        System.out.println(com);


    }
}
