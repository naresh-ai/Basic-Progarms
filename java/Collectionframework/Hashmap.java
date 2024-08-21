package Collectionframework;

import java.util.HashMap;

public class Hashmap {

    String fname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    String lname;

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public static void main(String[] args) {
         Hashmap obj=new Hashmap();
         obj.setFname("Rana");
         obj.getFname();

         obj.setLname("Rana");
         obj.getLname();
        System.out.println(obj.hashCode());
        System.out.println(obj.hashCode());
        HashMap< Integer,String>m=new HashMap<>();
        m.put(1,"Rana");
        m.put(2,"Rana");
        System.out.println(m.get(1));
        System.out.println(m.get(2));
        System.out.println(m.hashCode());
        System.out.println((m.hashCode()));






    }



}
