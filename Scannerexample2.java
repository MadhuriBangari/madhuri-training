import java.util.Scanner;
class Patient
{
String name;
String address;
String disease;
int age;
long mobile;
}
class Doctor{
String doct_name;
int doct_age;
String doct_address;
long contact;
static String hospital;
}
class Scannerexample2{
public static void main(String args[])
{
Patient suman=new Patient();
Scanner sc=new Scanner(System.in);
System.out.println("enter patient details");
suman.name=sc.next();
suman.address=sc.next();
suman.disease=sc.next();
suman.age=sc.nextInt();
suman.mobile=sc.nextLong();
System.out.println("patient name="+suman.name);
System.out.println("patient address="+suman.address);
System.out.println("patient disease="+suman.disease);
System.out.println("patient age="+suman.age);
System.out.println("patient mobile="+suman.mobile);
Doctor jhon=new Doctor();
System.out.println("enter doctor details");
jhon.doct_name=sc.next();
jhon.doct_age=sc.nextInt();
jhon.doct_address=sc.next();
jhon.contact=sc.nextLong();
Doctor.hospital=sc.next();
System.out.println("doctor name="+jhon.doct_name);
System.out.println("doctor age="+jhon.doct_age);
System.out.println("doctor address="+jhon.doct_address);
System.out.println("doctor contact="+jhon.contact);
System.out.println("hospital name="+Doctor.hospital); 
}
}
 



