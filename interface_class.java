interface interface_class {
    void msg();
}
class A implements interface_class{
    public void msg(){ System.out.println("Hello World");}
    public static void main(String[] args) {
        interface_class obj = new A();
        obj.msg();
    }
}
