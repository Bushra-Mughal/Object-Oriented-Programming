//Constructor is a special funtion having same name   as class name.

public class constructor {
    int data;
    public constructor(){
          System.out.println("No argument constructor.");
    }
    public constructor(int num){
        this();
        data=num;
        System.out.println("Parameterized construstor.");
    }
    public static void main(String[] args) {

        //Create an object and call parameterized constructor:
        constructor obj =new constructor(20); 
        System.out.println(obj.data);
    }
}

