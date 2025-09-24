//Tip: To take user input , use "Scanner class" from "java.util library"

//Package import:
import java.util.Scanner;

//Main class:
public class Input {
    //Main function:
    public static void main(String[] args){
        //Scanner class object creation:
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age: ");
        //Take integer input from user and store in a variable:
        int age=sc.nextInt();
        //Print age:
        System.out.println("Age is: " + age);
    }
}