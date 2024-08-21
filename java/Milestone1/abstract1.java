package Milestone1;

public class abstract1 {
    abstract class PPP{
        abstract void test1();
        abstract void test2();
    }

    abstract class QQQ extends PPP{
        @Override
        void test1() {

        }
        abstract void test3();
    }

    public class AbstractionKnowledgeTest extends QQQ{
        @Override
        void test2() {

        }

        @Override
        void test3() {

        }
    }



}
