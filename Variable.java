class Student
{
int id;
double percentage;
static String clg;
}
class Employee
{
int employee_id;
int salary;
static String company_name;
}
class Variable
{
public static void main(String args[])
{
Student rahul=new Student();
rahul.id=512;
rahul.percentage=71.1;
Student.clg="bits";
System.out.println("=============student details============");
System.out.println("Student id="+rahul.id);
System.out.println("Student percentage="+rahul.percentage);
System.out.println("Student college="+Student.clg);
Employee shiva=new Employee();
shiva.employee_id=12;
shiva.salary=22000;
Employee.company_name="motivity";
System.out.println("=================employee detail=========");
System.out.println("employee id="+shiva.employee_id);
System.out.println("employee salary="+shiva.salary);
System.out.println("company name="+Employee.company_name);
}
}



