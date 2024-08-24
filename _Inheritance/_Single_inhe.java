import java.util.*;
class College
{
int cno;
String cname,add;
void accept_C()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Cno");
cno=sc.nextInt();
System.out.println("Enter Cname");
cname=sc.next();
System.out.println("Enter Address");
add=sc.next();
}
}
class Student extends College
{
int rno;
String sname;
void accept_S()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter student Roll");
rno=sc.nextInt();
System.out.println("Enter name");
sname=sc.next();
}
void display()
{
System.out.println("College No="+cno);
System.out.println("College Name="+cname);
System.out.println("College add="+add);
System.out.println("Student Roll="+rno);
System.out.println("Student Name="+sname);
}
}
class MD
{
public static void main(String args[]){
Student ob=new Student();
ob.accept_C();
ob.accept_S();
ob.display();
}
}




