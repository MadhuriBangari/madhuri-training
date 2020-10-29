class Item
{
void listOfItems(){
System.out.println("=================list of items===================");
System.out.println("items available in amazon watches,rings,chains,dresses,chappals,earings");
}
String searchItem()
{
return "watch";
}
void addToCart(String itemname)
{
System.out.println("item added to cart" + itemname);
}
int viewPrice()
{
return 400;
}
int payAmount()
{
return 400;
}
String checkStatusOfItem()
{
return "recieve friday";
}
}
class Shopping{
public static void main(String args[])
{
Item online=new Item();
online.listOfItems();
System.out.println("searches item is "+online.searchItem());
online.addToCart("watch");
System.out.println("price viewed " + online.viewPrice());
System.out.println("amount payed " + online.payAmount());
System.out.println("checking status of delivery: " + online.checkStatusOfItem());
}
} 



