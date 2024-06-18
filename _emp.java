import java.util.*;
class emp
{
int eno;
String ename;
double sal;
void accept(int eno1,String ename1,double sal1)
{
eno=eno1;
ename=ename1;
sal=sal1;
}
void disp()
{
System.out.println("emp no="+eno);
System.out.println("emp name="+ename);
System.out.println("emp sal="+sal);
}
public static void main(String arg[])
{
emp ob=new emp();
ob.accept(101,"om",9999);
ob.disp();
}
}

