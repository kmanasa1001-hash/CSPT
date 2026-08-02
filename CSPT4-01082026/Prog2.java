class StaticDemo1{
//Static block
static{
IO.println("This is Static block");
}
//class main method
public static void main1(String[] args){
IO.println("Class Main Method");
}
//Instance main method
void main2(){
IO.println("Instance Main Method");
}
void main(){
main1();
main2();
}
}
//why we cannot use static block inside unnamed class of java
//is it a security purpose based on which static block is not allowed in unamed class of java
// how void main() in unamed class of java works implicitly without having an object.
//inside a named class i have created Instance main method through which i am calling both static method and non static method without using any object how it works
