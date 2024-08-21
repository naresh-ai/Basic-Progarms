package Stringprograms;



public class methodsStr {
    //public static void main(String[] args)
    //public static void main(String[] args)
    //uncode used to gve uncode from strng
    public void naa()
    {
        String ss = "oknana";
        System.out.println(ss);
    }
    public static  void  ok(){
        String na=" nmnsmns";
        System.out.println(" unicon id shows char");
        System.out.println(na.codePointAt(3));

    }
    public static void codepointbefore(){
        String oj="rose";
        System.out.println(" rose output");
        System.out.println(oj.codePointBefore(3));
    }
    public static void codepointcount(){
        String oo="darlo";
        System.out.println(" darlo output");
        System.out.println(oo.codePointCount(0,3));
    }
    public  static  void  contains(){
        String myStr = "Hello";
        System.out.println(myStr.contains("Hel"));   // true
        System.out.println(myStr.contains("e"));     // true
        System.out.println(myStr.contains("Hi"));
    }

    public  static void containsequal(){
        String myStr = "Hello";
        System.out.println(myStr.contentEquals("Hello"));  // true
        System.out.println(myStr.contentEquals("e"));      // false
        System.out.println(myStr.contentEquals("Hi"));
    }
    public static  void copyvalueof(){
        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        String myStr2 = "";
        myStr2 = myStr2.copyValueOf(myStr1, 0, 3);
        System.out.println("Returned String: " + myStr2);
    }
    public  static void copy2(){
        char[]sss={'N','A','A'};
        String sss1=" ";
        sss1= sss1.copyValueOf(sss,0,1);


    }
    public  static void tostrString(){
        String myStr = "Hello, World!";
        System.out.println(myStr.toString());
    }
    public static void substr(){
        String myStr = "Hello, World!";
        System.out.println(myStr.substring(7, 12));
    }
    public static  void trim(){
        String myStr = "       Hello World!       ";
        System.out.println(myStr);
        System.out.println(myStr.trim());
    }
    public static void join()

    {
        String fruits = String.join(" ", "Orange", "Apple", "Mango");
        System.out.println(fruits);
    }




    public static void main(String[] args) {
        methodsStr ss = new methodsStr();
        ss.naa();
        //codePointAt nana= new codePointAt();
        ok();
        codepointcount();
        System.out.println(   "    ");
        codepointbefore();
        System.out.println(" ");
        contains();
        System.out.println();
        containsequal();
        System.out.println();
        copyvalueof();
        System.out.println();
        tostrString();
        System.out.println();
        substr();
        System.out.println();
        trim();
        System.out.println();
        join();



    }

}

