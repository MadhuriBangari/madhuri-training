import java.util.Scanner;
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
class Scannerexample
{
public static void main(String args[])
{
Student rahul=new Student();
Scanner sc=new Scanner(System.in);
System.out.println("enter student details");
rahul.id=sc.nextInt();
rahul.percentage=sc.nextFloat();
Student.clg=sc.next();
System.out.println("=============student details============");
System.out.println("Student id="+rahul.id);
System.out.println("Student percentage="+rahul.percentage);
System.out.println("Student college="+Student.clg);
Employee shiva=new Employee();
System.out.println("enter employye details"); 
shiva.employee_id=sc.nextInt();
shiva.salary=sc.nextInt();
Employee.company_name=sc.next();
System.out.println("=================employee detail=========");
System.out.println("employee id="+shiva.employee_id);
System.out.println("employee salary="+shiva.salary);
System.out.println("company name="+Employee.company_name);
}
}





