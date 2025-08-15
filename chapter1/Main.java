// sample file
package chapter1;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        // create and instance of a Toy class = Toy object

        /*   this
        *    is a
        * multiline 
        *comment
*/
        Toy toy1 = new Toy();
        toy1.name ="Rage pink";
        toy1.brand = "Lab Vuvu";
        toy1.price = 4500;
        toy1.quantity = 12;
        System.out.println();
        Random r = new Random();
        System.out.println(r.nextInt(100));
        ArrayList al = new ArrayList<>();
        Date date1 = new Date();

        echo("This is testing from K.Salvador"); //String
        echo(123); //int
        echo(98.5); //double
        echo(true); //boolean
    }

    static void echo(String data){System.out.println(data);} //shorten the System.out.println() to echo()
    static void echo(int data){System.out.println(data);}
    static void echo(double data){System.out.println(data);}
    static void echo(boolean data){System.out.println(data);}
}