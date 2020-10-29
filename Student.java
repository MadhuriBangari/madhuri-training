class Library{
void listOfBooks()
{
System.out.println("===================list of books in library================");
System.out.println("1.science 2.mathematics 3.biology 4.social");
}
void searchBooks(String book1,String book2,String book3)
{
System.out.println("searched books are "+ book1+" " + book2+" " + book3);
}
String requestBook()
{
return "science";
}
void readBook(String bookname)
{
System.out.println("read bookname is "+bookname);
}
String returnBook()
{
return "science";
}
int payBill()
{
return 459;
}
}
class Student{
public static void main(String args[])
{
Library bits=new Library();
bits.listOfBooks();
bits.searchBooks("social" ,"science" ,"mathematics");
System.out.println("requested book is "+bits.requestBook());
bits.readBook("science");
System.out.println("returned book "+bits.returnBook());
System.out.println("billpayed "+bits.payBill());
}
}

