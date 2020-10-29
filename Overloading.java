class Nursurey
{
void plant(String plant)
{
System.out.println("plant name= "+plant);
}
void plant(String plant1,String plant2,String plant3)
{
System.out.println("plants selected to buy= "+plant1+" "+plant2+" "+plant3);
}
void plant(String plant4,String plant5)
{
System.out.println("favourite plants are= "+plant4+" "+plant5) ;
}
}
class Overloading
{
public static void main(String args[])
{
Nursurey flower=new Nursurey();
flower.plant("rose");
flower.plant("sunflower","lilly","jasmine");
flower.plant("hybiscus","lotus");
}
}
