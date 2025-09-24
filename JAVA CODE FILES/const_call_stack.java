//Constructor call stack: parent constructor is called before child constructor.
//Java auto-inserts 'super();'

public class const_call_stack{}

class Grandparent {
    Grandparent() {
        System.out.println("Grandparent's constructor");
    }
    //Main function:
    public static void main(String[] args) {
        Child obj = new Child(); // Start the chain!
    }
}
class Parent extends Grandparent {
    Parent() {
        System.out.println("Parent's constructor");
    }
}
class Child extends Parent {
    Child() {
        System.out.println("Child's constructor");
    }
}


//Task: Print 'Argument' and 'No argument' constructors of both parent and child class. There should be only one construtor call while four output statements of each constructor.

class p{

    p(){ System.out.println("P NOARG"); }
    p(int x){ this(); System.out.println("P ARG"); }

}
class c extends p{ 

    c(){ this(2); System.out.println("C NOARG"); }
    c(int x){ super(2); System.out.println("C ARG"); }
    //Main funtion:
    public static void main(String[] args) {
        c obj = new c();
    }
}
