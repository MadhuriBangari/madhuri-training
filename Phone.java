class Electronics{
void types()
{
System.out.println("electronics types are 1.mobile 2.laptop 3.tv");
}
}
class Mobile extends Electronics
{
void model()
{
System.out.println("model is vivo");
}
}
class Oneplus extends Mobile
{
void colour()
{
System.out.println("colour is black");
}
}
class Phone{
public static void main(String args[])
{
Oneplus p1=new Oneplus();
p1.types();
p1.model();
p1.colour();
}
}
