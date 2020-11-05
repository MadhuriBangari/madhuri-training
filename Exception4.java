class Exception4
{
public static void main(String args[])
{
String str="madhu";
try
{


System.out.println(str.charAt(6));

}
catch(StringIndexOutOfBoundsException ae)
{
ae.printStackTrace();
}
}
}