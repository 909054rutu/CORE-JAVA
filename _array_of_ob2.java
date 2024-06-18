import java.util.*;
class demo
{
String name;
int sal,id;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name");
name=sc.next();
System.out.println("Enter sal");
sal=sc.nextInt();
System.out.println("Enter id");
id=sc.nextInt();
}
void disp()
{
System.out.println("Name="+name);
System.out.println("Sal="+sal);
System.out.println("Id="+id);
}
public static void main(String arg[])
{
demo ob[]=new demo[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter limit");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
ob[i]=new demo();
ob[i].accept();
}
for(int i=0;i<n;i++)
{
ob[i].disp();
}
}
}
