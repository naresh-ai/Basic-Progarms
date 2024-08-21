package Collectionframework;

import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable
{
    String name =null;
    String lastnamel=null;
    String  id=null;

    public Serialization(String name, String lastnamel, String id)
    {
        this.name = name;
        this.lastnamel = lastnamel;
        this.id = id;
    }
  public class Test
 {
     public static void main(String[] args)
     {

         Serializable s = new Serialization("Narsh", "Petkar", "1");
         //FilterOutputStream fos=new FilterOutputStream("abc.txt");
         //FileInputStream fos1=new FileInputStream(fos);
         //fos.write(Serialization);

     }
 }
}
