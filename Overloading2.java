class Human
{
void person(String name,String place,String hobbies)
{
System.out.println("person data= "+name+" "+place+" "+hobbies);
}
void person(String name,String place)
{
System.out.println("person data= "+name+" "+place);
}
void person(String name)
{
System.out.println("person data= "+name);
}
}
class Overloding2
{
public static void main(String args[])
{
Human manu=new Human();
manu.person("manu","wgl","singing");
manu.person("chintu","hyd");
manu.person("haritha");
}
}
 