class Dog{
void eat()
{
System.out.println("dog eat biscuits");
}
void drink()
{
System.out.println("dog drink water");
}
}
class Cat extends Dog
{
void run()
{
System.out.println("cat runs");
}
void speak()
{
System.out.println("meow meow");
}
}
class Animal
{
public static void main(String args[])
{
Cat kit=new Cat();
kit.eat();
kit.drink();
kit.run();
kit.speak();
}
}



