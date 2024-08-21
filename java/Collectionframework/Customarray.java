package Collectionframework;

public class Customarray {
    Object[] objArray ={};
    int size;

    public   Customarray (){
        objArray=new Object[10];
        size = 0;
    }
    public void add(Object  a){

        objArray[size ++]=a;
    }
public Object get(int b){
        return objArray[b];

}
public void print (){
    System.out.print("[");
    for (int i = 0; i <size  ; i++) {
        System.out.print(objArray[i]);
        if(i<size-1){
            System.out.print(", ");
        }
        //System.out.println();
    }
    System.out.println("]");
}
public void remove(int a){
    for (int i = a; i <size-- ; i++) {
        objArray[i]=objArray[i+1];

    }
    objArray[size-1]=null;
    size--;

}

    public static void main(String[] args) {

        Customarray ob= new Customarray();
        ob.add("nana");
        ob.add("dheeraj");
        ob.add("ok");
        ob.add("same");
        //System.out.println(ob.get(0));
        //System.out.println(ob.get(1));
       // ob.print();
       ob.remove(2);
        ob.print();
    }

}
