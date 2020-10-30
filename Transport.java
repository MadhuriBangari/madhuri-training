interface Car
{
public void tyres();
}
interface Bus
{
public void tyres();
}
class Vech implements Car,Bus
{
public void tyres()
{
System.out.println("four");
}
}
class Transport
{
public static void main(String args[])
{
Vech v=new Vech();
v.tyres();
}
}

   