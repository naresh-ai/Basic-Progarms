package Collectionframework;

public class Serialization3 {
    private  String parentname;

    public Serialization3(String parentname, String childname) {
        this.parentname = parentname;
        this.childname = childname;
    }

    @Override
    public String toString() {
        return "Serialization3{" +
                "parentname='" + parentname + '\'' +
                ", childname='" + childname + '\'' +
                '}';
    }

    private  String childname;

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public String getChildname() {
        return childname;
    }

    public void setChildname(String childname) {
        this.childname = childname;
    }


}

