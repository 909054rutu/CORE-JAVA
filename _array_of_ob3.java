import java.util.*;
class demo
{
String ename;
float sal;
void accept(String ename,float sal)
{
this.ename=ename;
this.sal=sal;
}
void disp()
{
System.out.println("Name="+ename);
System.out.println("Sal="+sal);
}
public static void main(String arg[])
{
demo ob[]=new demo[10];
String ename;
float sal;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Limit");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
ob[i]=new demo();
System.out.println("Enter name");
ename=sc.next();
System.out.println("Enter sal");
sal=sc.nextFloat();
ob[i].accept(ename,sal);
}
for(int i=0;i<n;i++)
{
ob[i].disp();
}
}
}