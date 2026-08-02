class StaticDemo2{
String name;
String color;
int price;
public void show(String name,String color,int price){
IO.println(name + " " + color + " "+ price);
}
void main(String[] args){
StaticDemo sd = new StaticDemo();
sd.name = "cello";
sd.color= "blue";
sd.price =10;
sd.show(sd.name, sd.color, sd.price);
StaticDemo
 sd1 = new StaticDemo();
sd1.name = "PARKER";
sd1.color= "red";
sd1.price =40;
sd1.show(sd1.name, sd1.color, sd1.price);
IO.println(sd.price);
}
}