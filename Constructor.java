class Employee
{
int empid;
String empname;
int salary;
Employee()
{
empid=1023;
empname="mahesh";
salary=43000;
}
void display()
{
System.out.println("employee id= "+empid);
System.out.println("employee name= "+empname);
System.out.println("employee salary= "+ salary);
}
}
class Constructor{
public static void main(String args[])
{
Employee mahesh=new Employee();
mahesh.display();
}
}
