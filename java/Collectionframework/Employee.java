package Collectionframework;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    String fname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public static void main(String[] args) {
        Employee e1=new Employee();
      //  Employee e=new Employee();
       // System.out.println(e1.fname);
        HashMap<Employee,String >m=new HashMap<>();


       // System.out.println(e1.hashCode());
        e1.setFname("java");
        m.put(e1,"fdfd");
        System.out.println(m.get(e1));


        System.out.println("hash code of obj "+e1.hashCode());
        System.out.println("hash code of hash obj "+m.get(e1).hashCode());






//       // e.setFname("sdfgh");
//        m.put(e1, e1.fname);
//        e1.setFname("ert");
//       // m.put(e, e.fname);
//        System.out.println(m);
    }
}
