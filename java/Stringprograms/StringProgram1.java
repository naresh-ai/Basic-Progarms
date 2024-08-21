package Stringprograms;

public class StringProgram1 {
    public static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder("Java");
        StringBuilder stringBuilder1 = new StringBuilder("Java");
        boolean tt = stringBuilder.equals(stringBuilder1);     //false
        System.out.println("ttt  " + tt);

        stringBuilder = stringBuilder.append(" Programming");

        String s = new String("Java");
        String s1 = new String("Java");
        boolean t = s.equals(s1);         //true
        System.out.println("value t " + t);
        //System.gc();

        s = s.concat(" Programming");
        System.out.println(s);

    }
}