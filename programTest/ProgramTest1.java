package programTest;

import java.util.Scanner;

public class ProgramTest1 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("ENTER ANY STRING : ");
        String inputString = inputScanner.next();

        System.out.println("\nThe Length of your input is : " + inputString.length());
        System.out.println("Convert to UPPERCASE : " + inputString.toUpperCase());
        System.out.println("Convert to lowercase : " + inputString.toLowerCase());
        System.out.println("First Charater : " + inputString.charAt(0));
        System.out.println("Last Charater : " + inputString.charAt(inputString.length()-1));
        System.out.println("2nd Charater to 5th Character : " + inputString.substring(1, 5));

        inputScanner.close();
    }
    
}
