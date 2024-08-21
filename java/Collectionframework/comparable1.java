package Collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparable1 implements Comparable<comparable1> {
    public comparable1(String name, String lastanme, int id) {
        this.name = name;
        this.lastanme = lastanme;
        this.id = id;
    }

    private String name;
    private  String lastanme;

    @Override
    public String toString() {
        return "comparable1{" +
                "name='" + name + '\'' +
                ", lastanme='" + lastanme + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastanme() {
        return lastanme;
    }

    public void setLastanme(String lastanme) {
        this.lastanme = lastanme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private  int id;


    @Override
    public int compareTo(comparable1 o) {
        return this.getId()-(o.getId());
        //return this.getLastanme().compareTo(getLastanme());
    }

    public static void main(String[] args) {
        List<comparable1 >com=new ArrayList<>();
        com.add(new comparable1("naresh","petkar",1));
        com.add(new comparable1("namo","rd",2));
        com.add(new comparable1("ram","narayan",666));
        com.add(new comparable1("yog","sheryash",4));
        com.add(new comparable1("rana","dev",5));
        com.add(new comparable1("raj","suryaraj",609));
        com.add(new comparable1("hararaj","sopan",723));
        com.add(new comparable1("munna","jokarrao",34443348));
        com.add(new comparable1("harshat","mehta",98989));

        System.out.println(com);
        Collections.sort(com);
        System.out.println(com);



    }
}
