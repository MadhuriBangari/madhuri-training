class Trainer{
int id;
String name;
int salary;
int age;
String gender;
int experince;
String skills;
String address;
String mobile;
static String institute;
}
class Training{
public static void main(String args[])
{
Trainer ram=new Trainer();
ram.id=56;
ram.name="ramu";
ram.salary=43000;
ram.age=30;
ram.gender="male";
ram.experince=4;
ram.skills="excellent";
ram.address="hyd";
ram.mobile="9873644567";
Trainer.institute="qspiders";
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





