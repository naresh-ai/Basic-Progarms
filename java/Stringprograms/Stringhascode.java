package Stringprograms;

public class Stringhascode {
    public static void main(String[] args) {
        String s = new String("Java");
        String s1 = new String("Java");     //Heap
        String s2 = "Java";
        //String s3="java";
        //String s4="java";//Perm Gen

       /* System.out.println("Hashcode of s is "+s.hashCode());
        System.out.println("Hashcode of s1 is "+s1.hashCode());
        System.out.println("Hashcode of s2 is "+s2.hashCode());*/

        boolean t1 = (s1 == s2);
        boolean t2 = s1.equals(s2);
        System.out.println("Comparing 2 string object using  == "+t1);  //false
        System.out.println("Comparing 2 string object equals method "+t2);  //true
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        //== operator
        //Use equals() method if you want to compare contents of String object
        //Use == operator if they are pointing to same memory address
    }
}
