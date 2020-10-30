class Flower
{
void types()
{
System.out.println("various types of flowers are 1.rose 2.lilly 3.jasmine 4.sunflower");
}
}
class Rose extends Flower
{
void colour()
{
System.out.println("rose is in red colour");
}
}
class Lilly extends Flower
{
void smell()
{
System.out.println("lilly gives nice fragrance");
}
}
class Hier
{
public static void main(String args[])
{
Rose r1=new Rose();
Lilly l1=new Lilly();
l1.types();
l1.smell();
r1.types();
r1.colour();
}
}


