package Collectionframework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class comparaable {

    private String name;

    public comparaable(String name, String lastanme, int id) {
        this.name = name;
        this.lastanme = lastanme;
        this.id = id;
    }

    private String lastanme;
    private int id;


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

    @Override
    public String toString() {
        return "comparaable{" +
                "name='" + name + '\'' +
                ", lastanme='" + lastanme + '\'' +
                ", id=" + id +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    class comparaabel implements Comparator<comparaabel> {
        public comparaabel(String ss, String ss1, String number) {
        }

        public void main(String[] args) {
            List<comparaabel>com=new ArrayList<>();
            com.add(new comparaabel("ss","ss","1"));






        }


        @Override
        public int compare(comparaabel o1, comparaabel o2) {
            return 0;
        }
    }
}