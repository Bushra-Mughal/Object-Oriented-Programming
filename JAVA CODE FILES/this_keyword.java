//'This' keyword is a 'pointer' to the current object of class. 
//In simple words, it stores memory location of class object. 


//Common use cases:
//1. Use 'this' keyword for calling a 'class contructor'
//2. Use 'this' keyword in class method to differentiate between local variable and instance variable.


public class A {
    //instance variable:
    int num;
    //No argument constructor:
    A(){
        System.out.println("No argument constructor call");
    }

    //One argument constructor:
    A(int num){
        //To call No argument constructor first:
        this();
        //To differentiate local variable with instance variable:
        this.num=num; 
        System.out.println("One argument contructor call ");
    }
    public static void main(String[] args) {
        //One argument constructor call:
        A obj = new A(12);
        //Print instance variable value:
        System.out.println(obj.num);
    }
}