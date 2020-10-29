import java.util.Scanner;
class Trainer
{
int id;
String name;
float salary;
int age;
String gender;
int experince;
String skills;
String address;
String mobile;
static String institute;
}
class Scannerexample3{
public static void main(String args[])
{
Trainer ram=new Trainer();
Scanner sc=new Scanner(System.in);
System.out.println("enter trainer details");
ram.id=sc.nextInt();
ram.name=sc.next();
ram.salary=sc.nextFloat();
ram.age=sc.nextInt();
ram.gender=sc.next();
ram.experince=sc.nextInt();
ram.skills=sc.next();
ram.address=sc.next();
ram.mobile=sc.next();
Trainer.institute=sc.next();
System.out.println("trainer id="+ram.id);
System.out.println("trainer name="+ram.name);
System.out.println("trainer salarly="+ram.salary);
System.out.println("trainer age="+ram.age);
System.out.println("trainer gender="+ram.gender);
System.out.println("trainer experince="+ram.experince);
System.out.println("trainer skills="+ram.skills);
System.out.println("trainer address="+ram.address); 
System.out.println("trainer mobile="+ram.mobile);
System.out.println("trainer institute="+Trainer.institute);
}
}





