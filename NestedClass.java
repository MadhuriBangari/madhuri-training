abstract class Animal{
abstract void eat();
}
class NestedClass{
public static void main(String args[])
{
new Animal()
{
void eat()
{
System.out.println("eating grass");
}

}.eat();
}
}