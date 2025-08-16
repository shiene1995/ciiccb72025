package object; //this is how to register your file to import

import chapter1.Toy; //this is how to import from another folder

//import note: if the file is in the same folder, you don't need to import it. Unless the file is in another folder like above import!

public class Name{

    String Fname = "Kenneth";
    String Lname = "Salvador";
    String fullName = Fname + " " + Lname;

     Name(String data1, String data2){
        this.Fname = data1;
        this.Lname = data2;
        this.fullName = data1 + " " + data2;
    }
    public static void main(String[] args) {

        Name myName = new Name("John", "Loyd"); //Creating Object

        System.out.println("Fullname : " + myName.fullName);

        Car car = new Car();
        car.name = "HONDA";
        System.out.println(car.name);

        Toy toy = new Toy();
        toy.name = "AVENGERS"; //should be public the variable to call it in another folder
        System.out.println(toy.name);

    }
}