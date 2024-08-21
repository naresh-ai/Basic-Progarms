package Cool;

public class Animal implements Comparable<Animal> {
    int id;
    String name;

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    String lastname;


    Animal(int id,String name,String lastname){
        this.id=id;
        this.name=name;
        this.lastname=lastname;

    }

    @Override
    public int compareTo(Animal o) {
        return 0;
    }
}
