package ProblemSloving;

import java.util.Scanner;

public class example1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int option;
        String ans;
      

        while (true) {

            System.out.println("Enter your choice here");
            System.out.println("1. Start");
            System.out.println("2. Exit");
         
            option = scan.nextInt();
            int score = 0;
            if (option == 1) {

                System.out.println("What is the multiple of 6\n"
                        + "a)36\n"
                        + "b)42\n"
                        + "c)33\n"
                        + "d)88");
                ans = scan.next();

                if (ans.equals("a")) {
                    score++;
                }

                System.out.println("Which is int datatype\n"
                        + "a)36\n"
                        + "b)42.2\n"
                        + "c)33/3\n"
                        + "d)88.0");
                ans = scan.next();

                if (ans.equals("a")) {
                    score++;
                }

                System.out.println("What is the output of 3/0\n"
                        + "a)error\n"
                        + "b)3\n"
                        + "c)0\n"
                        + "d)infinite");
                ans = scan.next();

                if (ans.equals("a")) {
                    score++;
                }

                System.out.println("Correct the spelling of arrreemy\n"
                        + "a)army\n"
                        + "b)arm\n"
                        + "c)iron\n"
                        + "d)yellow");
                ans = scan.next();

                if (ans.equals("a")) {
                    score++;
                }

                System.out.println("Your score: " + score);
            }

            else {
                System.out.println("Thank you");
                break;
            }
        }

        scan.close();
    }
}