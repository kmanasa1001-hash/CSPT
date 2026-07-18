class Animal {
    public void makesound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makesound() {
        System.out.println("Meow....");
        super.makesound();   // Calls the parent class method
    }
}

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makesound();
    }
}