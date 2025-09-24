//Create a calculator using java

import java.util.Scanner;
 
public class Calculator {

    //Create member funtions:
    void addition(float a,float b){
        System.out.println("Sum is: "+ (a+b));
    }
    void subtraction(float a,float b){
        System.out.println("Difference is: "+ (a-b));
    }
    void multiplication(float a,float b){
        System.out.println("Product is: "+ (a*b));
    }
    void division(float a,float b){
        System.out.println("Division is: "+ (a/b));
    }
    //Main function:
        public static void main(String[] args){

        //Initialize objects:
        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();

        System.out.println("Enter value 1: ");
        float val_1 = sc.nextFloat();
        System.out.println("Enter value 2: ");
        float val_2 = sc.nextFloat();
        //Call memeber funtions:
        obj.addition(val_1, val_2);
        obj.subtraction(val_1, val_2);
        obj.multiplication(val_1, val_2);
        obj.division(val_1, val_2);
    }   
}
