class Car
{
void cost()
{
System.out.println("no cost");
}
void millage()
{
System.out.println("no millage");
}
}
class Audi extends Car{
void cost()
{
System.out.println("40 lakhs");
}
void millage()
{ 
System.out.println("200km");
}
}
class Bmw extends Car
{
void cost()
{
System.out.println("50lakhs");
}
void millage()
{
System.out.println("100km");
}
}
class Upcasting
{
public static void main(String args[])
{
Car x=new Car();
x.cost();
x.millage();
x=new Audi();
x.cost();
x.millage();
x=new Bmw();
x.cost();
x.millage();
}
}



