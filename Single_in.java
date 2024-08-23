class A
{
A()
{
System.out.println("I am Base Class");
}
}
class B extends A
{
B()
{
System.out.print("I am Derived Class");
}
}
class MD
{
public static void main(String args[]){
B ob=new B();
}
}