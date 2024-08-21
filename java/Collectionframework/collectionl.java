package Collectionframework;

import java.util.*;

public class collectionl {
    public static void main(String[] args) {
       /* List<Integer> ob=new ArrayList<>();
        ob.add(11);
        ob.add(1777);
        ob.add(13);
        ob.add(14232);
        ob.add(15);

        System.out.println(ob);
        Collections.sort(ob);
        System.out.println(ob);
*/

        List<Students> obj =new ArrayList<>();
            Students students=new Students("nana","mka","12");
            obj.add( (new Students ("nana","mka","12")));
           obj.add( (new Students ("ndana","mkja","212")));
        obj.add( (new Students ("nansda","dsdmka","898")));
        obj.add( (new Students ("nanjkja","mooka","56512")));
        System.out.println(obj);
            /*List<String>obj1= new ArrayList<>();
        obj1.add("nonoon");
        obj1.add("nonosa");
        obj1.add("nonods");
        obj1.add("nonode");
        obj1.add("nonosu");
        System.out.println(obj1);
        Collections.sort(obj1);
*/

    }
}
/*class  Students implements Comparator1<Students>{

    @Override
    public int compare(Students o1, Students o2) {
        return 0;
    }
}*/
//class Students implements  Comparable<Students>{

  //  @Override
    //public int compareTo(Students o) {
      //  return 0;
    //}

class Students implements Comparable<Students>{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", lname='" + lname + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    String lname;

    public Students(String name, String lname, String id) {
        this.name = name;
        this.lname = lname;
        this.id = id;
    }

    String id;




    @Override
    public int compareTo(Students o2) {
      // return this.getName().compareTo(o2.getName());


       return this.getId().compareTo(o2.getId());

    }
}

