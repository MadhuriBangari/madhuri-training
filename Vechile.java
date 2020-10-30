class Car
{
void cost()
{
System.out.println("no cost");
}
void milage()
{
System.out.println("no millage");
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
class Vechile{
public static void main(String args[])
{
Bmw b1=new Bmw();
b1.cost();
b1.millage();
}
} 