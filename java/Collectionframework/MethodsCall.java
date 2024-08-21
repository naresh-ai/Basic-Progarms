package Collectionframework;
interface A2{
    default void  Same(){
        System.out.println("Java Better Lanuage");
    }
    static  void Same2(){
        System.out.println("Ok Done");
    }

}

public class MethodsCall {
    String arr[]={"sok","jkjk"};

    void m1() {
        System.out.println("hello");
    }

    void m2() {
        System.out.println("Hello Java");
    }

    void m3() {
        System.out.println("Hello World");
    }


    public static void main(Character[] args) {
        MethodsCall obj = new MethodsCall();
        System.out.println();
        obj.m1();
        obj.m2();
        obj.m3();
       // main(arr);


    }
    class Object{
        public static void main(String[] args) {

            System.out.println("H");

        }
    }
}

