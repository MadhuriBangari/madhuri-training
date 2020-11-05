class Exception2
{
public static void main(String args[])
{
String name=null;
try
{


System.out.println(name.length());

}
catch(NullPointerException ae)
{
ae.printStackTrace();
}
}
}