package AbstarctionProgarm;



interface A {
    default void Rocks() {
        System.out.println("Maybe");
    }

    void sound();

    void Marker();

    static void Raja() {
        System.out.println("ok Call ME ");
    }

        interface BA{
        String Roa=" OkMAn";
        default void MAn(){

            System.out.println("ok Sheryash");
        }


        }
    public class B implements A,BA {


        @Override
        public void sound() {
            System.out.println("OK Ac Created");
        }

        @Override
        public void Marker() {
            System.out.println("can You call me");
        }



    }

    public class AbstractFour {
        public static void main(String[] args) {
            System.out.println("BA Roa:"+ BA.Roa);
            B aa = new B();
            aa.Marker();
            aa.sound();
            aa.Rocks();

            Raja();
            aa.MAn();

        }

    }
}