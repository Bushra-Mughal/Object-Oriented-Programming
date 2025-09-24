import java.util.Scanner;
public class exceptionhandling {
    public static void main(String[] args){
        try{                 //error detection
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int user=sc.nextInt();
        System.out.println(8/user);}

        catch(Exception e){  //error handling
            System.out.println("Exception is: "+e);  
        }
        finally{              //always executes
            System.out.println("End of program.");
        }
        
    }
    
}
