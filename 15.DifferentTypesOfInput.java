
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String text = scanner1.nextLine();
        
        
        System.out.println("Give an integer: ");
        int integer1 = Integer.valueOf(scanner1.nextLine());
        
        
        System.out.println("Give a double: ");
        double floatingPoint = Double.valueOf(scanner1.nextLine());
        
        
        System.out.println("Give a boolean: ");
        boolean trueOrFalse = Boolean.valueOf(scanner1.nextLine());
        
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + integer1);
        System.out.println("You gave the double " + floatingPoint);
        System.out.println("You gave the boolean " + trueOrFalse);
    }
}
