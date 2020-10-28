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
class Hospital{
public static void main(String args[])
{
Patient suman=new Patient();
suman.name="suman sai";
suman.address="warangal";
suman.disease="fever";
suman.age=25;
suman.mobile=7896543421L;
System.out.println("patient name="+suman.name);
System.out.println("patient address="+suman.address);
System.out.println("patient disease="+suman.disease);
System.out.println("patient age="+suman.age);
System.out.println("patient mobile="+suman.mobile);
Doctor jhon=new Doctor();
jhon.doct_name="joseph jhon";
jhon.doct_age=76;
jhon.doct_address="hyd";
jhon.contact=6874392486L;
Doctor.hospital="rohini";
System.out.println("doctor name="+jhon.doct_name);
System.out.println("doctor age="+jhon.doct_age);
System.out.println("doctor address="+jhon.doct_address);
System.out.println("doctor contact="+jhon.contact);
System.out.println("hospital name="+Doctor.hospital); 
}
}
 



 