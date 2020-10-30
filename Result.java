class Square
{
int a=5,b=20;   
void add()
{
System.out.println(a+b);
}
}
class Addition extends Square
{
int c=10;

void mul()
{
System.out.println(c*a);
}
}
class Result{
public static void main(String args[])
{
Addition obj=new Addition();
obj.add();
obj.mul();
}
}

