class Fruit
{
void types()
{
System.out.println("1.mango 2.banana,3.orange,4.apple");
}
}
class Apple extends Fruit
{
void taste()
{
System.out.println("apple is sweet");
}
}
class Mango extends Fruit
{
void colour()
{
System.out.println("mango is yellow in colour");
}
}
class Fruits
{
public static void main(String args[])
{
Mango m1=new Mango();
Apple a2=new Apple();
a2.types();
a2.taste();
m1.types();
m1.colour();
}
}