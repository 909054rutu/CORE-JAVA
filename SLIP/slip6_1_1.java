import java.util.*;
class ZeroNumberException extends Exception
{
public String toString()	
{
return "ZeroNumberException";
}
}
class demo
{
public static void main(String args[]){
try
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number");
int n=sc.nextInt();
if(n==0)
{
throw new ZeroNumberException();
}
int ld=n%10;
int fd=0;
while(n>0
){
fd=n%10;
n=n/10;
}
System.out.println("Sum="+(ld+fd));
}catch(Exception e)
{
System.out.print("Error="+e);
}
}
}