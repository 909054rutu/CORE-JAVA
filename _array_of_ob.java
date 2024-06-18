import java.util.*;
class demo
{
public static void main(String arg[])
{
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter limit");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
System.out.println(a[i]+"");
}
}
}