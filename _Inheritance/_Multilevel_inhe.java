class A
{
int x,y,z;
A()
{
x=10;
System.out.println("I am Base Class");
}
}
class B extends A
{
B()
{
y=20;
System.out.println("I am intermediate Class");
}
}
class C extends B
{
C()
{
z=30;
System.out.println("I am Derived Class");
System.out.println("Addition="+(x+y+z));
}
}
class MD
{
public static void main(String args[])
{
C ob=new C();
}
}