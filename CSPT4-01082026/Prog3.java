class StaticDemo2 {

    String name;
    String color;
    int price;

    public void show(String name, String color, int price) {
        System.out.println(name + " " + color + " " + price);
    }

    public static void main(String[] args) {

        StaticDemo2 sd = new StaticDemo2();
        sd.name = "Cello";
        sd.color = "Blue";
        sd.price = 10;

        sd.show(sd.name, sd.color, sd.price);

        StaticDemo2 sd1 = new StaticDemo2();
        sd1.name = "PARKER";
        sd1.color = "Red";
        sd1.price = 40;

        sd1.show(sd1.name, sd1.color, sd1.price);

        System.out.println(sd.price);
    }
}