class Exception3
{
public static void main(String args[])
{
int[] a={1,2,3,4,5};
try
{


System.out.println(a[6]);

}
catch(ArrayIndexOutOfBoundsException ae)
{
ae.printStackTrace();
}
}
}