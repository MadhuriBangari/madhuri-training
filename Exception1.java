class Exception1
{
public static void main(String args[])
{
int a=10,b=0,c;
try
{


System.out.println("division"+a/b);

}
catch(ArithmeticException ae)
{
ae.printStackTrace();
}
}
}