import java.util.*;
 class demo{
public static void main(String arg[]){
int a[]=new int[100];
Scanner sc=new Scanner(System.in);
System.out.println("Enter Limit");
int n=sc.nextInt();
int s=0;
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]%2==0)
s=s+a[i];
}
System.out.println(s);
}
}

