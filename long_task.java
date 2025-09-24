
import java.util.Scanner;

public class long_task {
    void salary_calculator(){
        float base_salary=50000;
        float bonus_salary=7500;
        System.out.println("Total salary is: "+(base_salary+bonus_salary));
    }

    void Perfomance_Evaluation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Perfomance: ");
        float val_1 = sc.nextInt();
        System.out.println("Enter years of experience: ");
        float val_2 = sc.nextInt();
        if ((val_1>75) & (val_2>=2)){
            System.out.println("You are pass. ");
        }
        else{
            System.out.println("You are not pass. ");
        }
    }

    void tax_deduction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary for tax_deduction: ");
        double salary = sc.nextFloat();
        double tax_salary = salary*0.10;
        salary-=tax_salary;
        System.out.println("Salary is: "+salary);
    }

    void leave_balance(){
        int paid_leaves=10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want leave? ");
        String leave = sc.next();
        if(leave.equals("yes")){
            paid_leaves--;
        }
        System.out.println("Leaves are: "+paid_leaves);   
    }
    public static void main(String[] args){
        long_task obj =new long_task();
        obj.salary_calculator();
        obj.Perfomance_Evaluation();
        obj.tax_deduction();
        obj.leave_balance();       
    }   
}