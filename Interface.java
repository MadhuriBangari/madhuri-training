interface Building
{
public void height();
}
interface Appartment
{
public void height();
}
class Room implements Building,Appartment
{
public void height()
{
System.out.println("600meters");
}
}
class Interface
{
public static void main(String args[])
{
Room r1=new Room();
r1.height();
}
}

 