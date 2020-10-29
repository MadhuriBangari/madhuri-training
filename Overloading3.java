class Hotel
{
void takeorder(String order)
{
System.out.println("ordered item is ="+order);
}
void takeorder(String order1,String order2)
{
System.out.println("ordered item is ="+order1+" "+order2);
}
void takeorder(String order1,String order2,String order3)
{
System.out.println("ordered item is ="+order1+" "+order2+" "+order3);
}
}
class Overloading3{
public static void main(String args[])
{
Hotel abhi=new Hotel();
abhi.takeorder("idly");
abhi.takeorder("dosa","wada");
abhi.takeorder("wada","poori","idli");
}
} 