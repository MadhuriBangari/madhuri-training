class Sports
{
void types()
{
System.out.println("types of games are 1.indoor 2.outdoor");
}
}
class Indoor extends Sports
{
void games()
{
System.out.println("different indoor games available 1.chess 2.carroms");
}
}
class Chess extends Indoor
{
void play()
{
System.out.println("two members will play chess");
}
}
class Game
{
public static void main(String args[])
{
Chess c1=new Chess();
c1.types();
c1.games();
c1.play();
}
}
