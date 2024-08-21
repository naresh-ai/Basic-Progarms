package Collectionframework;

    interface A {
        default void show() {
            System.out.println("Hello");
        }
    }

    interface B {
        default void show() {
            System.out.println("Hello2");
        }
    }

    class Ambiguity implements A, B {


        public static void main(String[] args) {
            Ambiguity obj = new Ambiguity();
            obj.show();
        }

        @Override
        public void show() {
            A.super.show();
        }
    }


