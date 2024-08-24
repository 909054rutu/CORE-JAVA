import java.util.*;
class continent
{
String C_name;
void accept_Con()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter continent name");
C_name=sc.next();
}
}
class country extends continent
{
String Cn_name;
void accept_country()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Country name");
Cn_name=sc.next();
}
}
class state extends country
{
String S_name;
void accept_state()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter state name");
S_name=sc.next();
}
void disp()
{
System.out.println("Continent Name"+C_name);
System.out.println("Country Name"+Cn_name);
System.out.println("State Name"+S_name);
}
}
class MD
{
public static void main(String args[])
{
state ob=new state();
ob.accept_Con();
ob.accept_country();
ob.accept_state();
ob.disp();
}
}