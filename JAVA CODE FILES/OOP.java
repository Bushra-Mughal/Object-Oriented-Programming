import java.util.Scanner;
public class OOP{
    Scanner sc1= new Scanner(System.in);
    private int accno;
    private String accholdername;
    private int balance;
    private int options;
        public void checkbalance(){
            System.out.println("balance="+ balance);}
        public void deposit(){
                System.out.print("Enter amount to deposit: ");
                int d=sc1.nextInt();
                balance+=d;
                System.out.println("Current balance= "+ balance); }
        public void withdraw(){
            System.out.println("Enter amount to withdraw: ");
            int w=sc1.nextInt();}
    public static void main (String[]args){
        Scanner sc2= new Scanner(System.in);
            OOP obj= new OOP();
        System.out.println("1.checkbalance");
        System.out.println("2.withdraw cash");
        System.out.println("3.deposit");
        System.out.println("choose options 1-3");
        int option=sc2.nextInt();
            if(option==1){obj.checkbalance();}
            else if(option==2){obj.withdraw();}
            else if(option==3){obj.deposit();}
        }
    }