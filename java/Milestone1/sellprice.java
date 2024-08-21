package Milestone1;

import java.util.Scanner;

public class sellprice {
    public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);

                // Taking input from the user for selling price and cost price
                System.out.print("Enter Selling Price: ");
                double sellingPrice = scanner.nextDouble();

                System.out.print("Enter Cost Price: ");
                double costPrice = scanner.nextDouble();

                // Calculating profit or loss
                if (sellingPrice > costPrice) {
                    double profit = sellingPrice - costPrice;
                    System.out.println("Profit is: " + profit);
                } else if (sellingPrice < costPrice) {
                    double loss = costPrice - sellingPrice;
                    System.out.println("Loss is: " + loss);
                } else {
                    System.out.println("No Profit No Loss");
                }

                scanner.close();




        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter your selling price =" );
        sellprice=sc.nextInt();

        System.out.println("enter your cost price =" );
        costprice=sc.nextInt();

        if(sellprice>costprice){
            sellprice=sellprice-costprice;
            System.out.println("it is profit");
        } else if (sellprice<costprice) {
            cp=cp-sp;
            System.out.println(" it is loss");
        }
        else {
            System.out.println("no loss no profit");
        }*/

    }
}
