//FOR DATA ENCRYPTION , ACCESS MODIFIERS ARE USED
//IN JAVA THERE ARE FOUR OF THEM. ACCORDING TO THEIR LEVEL OF ABSTRACTION/PRIVACY:
//1. private 
//2. protected
//3. default
//4. public

public class access_modifiers {
    public int pub_val = 12;
    protected int pro_val= 5;
    private int pri_val= 23;
    public static void main(String[] args){
        access_modifiers obj = new access_modifiers();
        System.out.println(obj.pub_val);
        System.out.println(obj.pro_val);
        System.out.println(obj.pri_val);
    }   
}
class mod extends access_modifiers{ }
class test{
    public static void main(String[] args){
        mod obj = new mod();
        System.out.println(obj.pub_val);
        System.out.println(obj.pro_val);
    }
}
