package Collectionframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;

public class Serialization5 extends Serialization3 {
    String name="Nana";
    static private String   srname="Rao";

    public Serialization5(String parentname, String childname, String name) {
        super(parentname, childname);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSrname() {
        return srname;
    }

    public static void setSrname(String srname) {
        Serialization5.srname = srname;
    }

    public Serialization5(String parentname, String childname) {
        super(parentname, childname);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Serialization3 s=new Serialization3("Petkar","Narsh");
       //FilterOutputStream fos=new FilterOutputStream();
        //FileInputStream fos1=new FileInputStream(String.valueOf(fos));





    }
}
