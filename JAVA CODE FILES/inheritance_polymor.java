//can't change signature(return value,name,arg) in override
//can only change arg in overloading 
public class inheritance_polymor{
    public void msg(){
        System.out.println("Parent class");
    }
}
class child extends inheritance_polymor{
    @Override
    public void msg(){
        System.out.println("Parent override");
    }
    public static void main(String[] args) {
        child obj=new child();
        obj.msg();
    }
}

