class Customer
{
String name;
int age;
String size_of_dress;
String dress_colour;
int dress_rate;
Customer(String x,int y,String z,String p,int q)
{
name=x;
age=y;
size_of_dress=z;
dress_colour=p;
dress_rate=q;
}
void display()
{
System.out.println("customer name= "+name);
System.out.println("customer age= "+age);
System.out.println("dress size= "+size_of_dress);
System.out.println("dress colour= "+dress_colour);
System.out.println("dress rate= "+dress_rate);
}
}
class Constructor3
{
public static void main(String args[])
{
Customer vinny=new Customer("vinny",19,"xl","pink",4500);
vinny.display();
Customer saisha=new Customer("saisha",20,"xxl","black",5000);
saisha.display();
}
}




 