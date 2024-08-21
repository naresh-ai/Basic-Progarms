package onlinemart;

public class star8 {
    public static void main(String[] args) {
        for (int i = 0; i <6; i++) {
            for (int j =3; j>0 ; j++) {
               System.out.print(" ");
            }
            for (int j = 0; j <i+1; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
