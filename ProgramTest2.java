import java.lang.annotation.ElementType;
import java.util.Scanner;

public class ProgramTest2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("ENTER ANY STRING : ");
        String inputString = inputScanner.nextLine();

        inputString = inputString.toLowerCase();

        String reverseString = "";

        for(int i = inputString.length() - 1; i >= 0; i--){
            reverseString = reverseString + inputString.charAt(i);
        }

        if (inputString.equals(reverseString)) {System.out.println("PALINDROM!");} else {System.out.println("NOT PALINDROM!");}
            
        inputScanner.close();
    }
}
