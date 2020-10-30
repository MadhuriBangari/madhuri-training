class Building
{
void height()
{
System.out.println("tall");
}
}
class Room extends Building
{
void height()
{
System.out.println("small");
}
}
class Building1
{
public static void main(String args[])
{
Building y=new Building();
y.height();
y=new Room();
y.height();
}
}
