class Restuarant{
void menu(){
System.out.println("1.idly 2.dosa 3.wada 4.poori");
}
void takeOrder(String order){
System.out.println("order given is "+order);
}
String serveFood(){
return "dosa";
}
int giveBill(){
return 412;
}
String payBill(int amount){
System.out.println("amount given is "+amount);
return "paid";
}
}
class Customer{
public static void main(String args[])
{
Restuarant ohris=new Restuarant();
ohris.menu();
ohris.takeOrder("dosa");
System.out.println("food server is "+ohris.serveFood());
System.out.println("Bill is "+ohris.giveBill());
System.out.println("Bill "+ohris.payBill(421));
}
}
