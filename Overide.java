class Pen
{
void colour()
{
System.out.println("colour of pen is blue");
}
}
class Ink extends Pen
{
void colour()
{
System.out.println("ink colour is black");
}
}
class Overide
{
public static void main(String args[])
{
Ink i1=new Ink();
i1.colour();
}
} 