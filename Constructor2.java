class Student
{
int id;
String name;
int age;
String branch;
int year;
Student()
{
id=123;
name="madhu";
age=18;
branch="cse";
year=4;
}
void displayStudentDetails()
{
System.out.println("student id= "+id);
System.out.println("student name= "+name);
System.out.println("student age= "+ age);
System.out.println("student branch = "+branch);
System.out.println("student year= "+year);
}
}
class Constructor2{
public static void main(String args[])
{
Student madhu=new Student();
madhu.displayStudentDetails();
}
}
