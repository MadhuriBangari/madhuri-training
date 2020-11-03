class College
{
static class Department
{
void departmentName()
{
System.out.println("cse");
}
static void branch()
{
System.out.println("branch name is cse");
}
}
}
class Snested
{
public static void main(String args[])
{
College.Department c1=new College.Department();
c1.departmentName();
College.Department.branch();



}
}





