package Stringprograms;

public class Stringreverse4 {
    public static void main(String[] args) {
        String input = "abcde"; //edcba
        String s = "Javalang";

        //e d c b a   charAt();
        //a b c d e
        //0 1 2 3 4

        /*
        length()                        8
        position/index/location     0 to 7

        for last index you must always remember length()-1 formula
         */

        //print all the characters in String s
        //use for loop
        //initialization => 0
        //condition   => less than length()
        //increment  => ++
        //sout =>charAt(index);
        //J a v a l a n g
        //0 1 2 3 4 5 6 7
       // for(int i = 0; i < s.length(); i++){
          //  System.out.println("Character at index/position "+i + "  is "+s.charAt(i));
        //}


        for(int i = s.length() - 1; i >= 0; i--){
            System.out.println("Character at index/position "+i + "  is "+s.charAt(i));
        }
        System.out.println(s);  //


       // System.out.println(input.length());   //
        //System.out.println(s.length());      //10
        //System.out.println(s.charAt(1));    //
        //System.out.println(input.charAt(2));   //*/

    }
}
