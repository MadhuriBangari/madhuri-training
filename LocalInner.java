class College
{
void name()
{
System.out.println("college name is bits");
class Department
{
void departmentName()
{
System.out.println("cse");
}
}
Department d1=new Department();
d1.departmentName();
}
}
class LocalInner
{
public static void main(String args[])
{
College c1=new College();
c1.name();
}
}





