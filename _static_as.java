class demo
{
static void add(int a,int b)
{
int c=a+b;
System.out.println("Addition="+c);
}
static void square(int a)
{
int c=a*a;
System.out.println("square="+c);
}
public static void main(String arg[])
{
demo ob=new demo();
ob.add(99,91);
ob.square(100);
}
}