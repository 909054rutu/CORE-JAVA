import java.util.*;
class cricket
{
String name;
int no_of_nout,trun;
float avg;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name");
name=sc.next();
System.out.println("Enter no of time not out");
no_of_nout=sc.nextInt();
System.out.println("Enter total");
trun=sc.nextInt();
}
void cal()
{
 avg=trun/no_of_nout;
}
void disp()
{
System.out.println("Player name="+name);
System.out.println("no of time not out="+no_of_nout);
System.out.println("Total="+trun);
System.out.println("Bat avg="+avg);
}
public static void main(String arg[])
{
cricket ob=new cricket();
ob.accept();
ob.cal();
ob.disp();
}
}
