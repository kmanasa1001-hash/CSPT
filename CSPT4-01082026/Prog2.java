class StaticDemo1 {

    // Static block
    static {
        System.out.println("This is Static Block");
    }

    // Class (static) method
    public static void main1(String[] args) {
        System.out.println("Class Main Method");
    }

    // Instance method
    void main2() {
        System.out.println("Instance Main Method");
    }

    // Instance main method (Java 24+ unnamed instance main style)
    void main() {
        main1(new String[0]); // Calling static method
        main2();              // Calling instance method
    }

    // Entry point for normal Java programs
    public static void main(String[] args) {
        StaticDemo1 obj = new StaticDemo1();
        obj.main();
    }
}
//why we cannot use static block inside unnamed class of java
//is it a security purpose based on which static block is not allowed in unamed class of java
// how void main() in unamed class of java works implicitly without having an object.
//inside a named class i have created Instance main method through which i am calling both static method and non static method without using any object how it works
