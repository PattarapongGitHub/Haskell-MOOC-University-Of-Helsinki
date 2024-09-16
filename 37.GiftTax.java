
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        double number = Double.valueOf(scan.nextLine());
        
        //Program
        if (number <= 4999) {
            System.out.println("No tax!");
            //5000 — 25000
        } else if (number <= 25000) {
            System.out.println("Tax: " + (100 + ((number-5000) * (double) 0.08)) );
            //25001 — 55000
        } else if (number <= 55000) {
            System.out.println("Tax: " + (1700 + ((number-25000) * (double) 0.10)) );
            //55000 — 200000
        } else if (number <= 200000) {
            System.out.println("Tax: " + (4700 + ((number-55000) * (double) 0.12)) );
            //200000 — 1000000
        } else if (number <= 1000000) {
            System.out.println("Tax: " + (22100 + ((number-200000) * (double) 0.15)) );
            //1000000 >
        } else if (number > 1000000) {
            System.out.println("Tax: " + (142100 + ((number-1000000) * (double) 0.17)) );
        } else {
            System.out.println("No Tax No Tax!");    
        }  
    }
}
