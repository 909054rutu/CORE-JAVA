import java.util.*;
class Demo
{
void volume(float r,float h)
{
float v=r*h;
System.out.println("Volume of cylinder="+v);
}
void factorial(int n)
{
int f=1;
for(int i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("factorial="+f);
}
void armstrong(int n)
{
int n1=n;
int s=0;
while(n>0)
{
int d=n%10;
s=s+(d*d*d);
n=n/10;
}
if(s==n1)
System.out.println("number is armstrong");
else
System.out.println("number is not armstrong");
}
public static void main(String arg[])
{
Demo ob=new Demo();
Scanner sc=new Scanner(System.in);
int ch;
do{
System.out.println("\n 1-Volume of cylinder \n 2-factorial \n 3-armstrong\n 4-exit");
System.out.println("Enter choice");
ch=sc.nextInt();
switch(ch)
{
case 1:System.out.println("Enter radius");
float r=sc.nextFloat();
System.out.println("Enter height");
float h=sc.nextFloat();
ob.volume(r,h);
break;
case 2:System.out.println("Enter number");
int n=sc.nextInt();
ob.factorial(n);
break;
case 3:System.out.println("Enter number");
 n=sc.nextInt();
ob.armstrong(n);
break;
case 4:System.exit(0);
}
}while(ch<5);
}
}
