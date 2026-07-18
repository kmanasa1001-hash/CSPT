//methods
//1.accesss specifier(private)
//2.returntype(void(ntg))
//3.methodname(show)
//4.(parameter list)


abstract class DemoAB{
    abstract public void show();
    public void display(){
    System.out.println("Display method");
    }
}
class AbsDemo extends DemoAB{
    @Override
    public void show(){
        System.out.println("I am SHOW FROM MEESHO");
    }
    public static void main(String[] args) {
        AbsDemo dab = new AbsDemo();
        dab.display();
    }
}