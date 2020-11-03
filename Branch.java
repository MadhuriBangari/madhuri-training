class College
{
void name()
{
System.out.println("college name is bits");
}
class Department
{
void departmentName()
{
System.out.println("cse");
}
}
}
class Branch{
public static void main(String args[])
{
College c1=new College();
c1.name();
College.Department b1=new College().new Department();
b1.departmentName();
}
}




