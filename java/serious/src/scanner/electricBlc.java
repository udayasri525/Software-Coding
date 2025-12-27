package scanner;
import java.util.Scanner;

public class electricBlc {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter units consumed:");
        long units = scan.nextLong();

        electric obj = new electric(units);
        obj.calculate();

        System.out.println("Your total bill: " + obj.getbill());

        scan.close();
    }
}
