package Stringprograms;
// remove word by word string
public class removewordbyword {
    public static void main(String[] args) {


        String line = " java developer working ";
        String []array=line.split(" ");
        System.out.println("count"+array);
        for (String s:array){
            System.out.println(s);
        }
        }
    }

