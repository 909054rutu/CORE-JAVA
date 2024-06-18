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
demo ob=new demo();
ob.accept("taksh",100000);
ob.disp();
}
}

