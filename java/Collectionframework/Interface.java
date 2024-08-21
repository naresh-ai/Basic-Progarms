package Collectionframework;

@FunctionalInterface
interface A123456 {
    void m1();
    default void m2(){};
}
public class Interface  implements A123456{
    @Override
    public void m1() {
        System.out.println("Hey");
    }
}
