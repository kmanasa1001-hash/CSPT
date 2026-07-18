Abstract class Employee{
    public void salary(){
        System.out.println("Display the salary");
    }

}
class manager extends Employee{
    @Override
    public void salary(){
        System.out.println("salary");
        super.salary();
    }
}
public void dispalyInfo(){
    System.out.println("Display the display info");
}
class Programmer extends Employee{
    @Override
    public void dispalyInfo

}
