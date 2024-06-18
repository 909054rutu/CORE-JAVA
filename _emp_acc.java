import java.util.*;
class emp
{
int eno,sal;
String name;
void accept(int eno1,int sal1,String name1)
{
eno=eno1;
sal=sal1;
name=name1;
}
void disp()
{
System.out.println("eno="+eno);
System.out.println("ename="+name);
System.out.println("sal="+sal);
}
public static void main(String arg[])
{
emp ob=new emp();
int eno,sal;
String name;
Scanner sc=new Scanner(System.in);
System.out.println("enter eno sal name");
eno=sc.nextInt();
sal=sc.nextInt();
name=sc.next();
ob.accept(eno,sal,name);
ob.disp();
}
}