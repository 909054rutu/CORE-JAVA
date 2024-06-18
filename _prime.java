class prime
{
public static void main(String arg[])
{
int n=3, i, s=0;
for(i=2;i<n;i++)
{
if(n%i==0)
break;
//s=s+i;
}
//if(s==0)
if(i==n)
System.out.println("number is prime");
else
System.out.println("number is not prime");
}
}
