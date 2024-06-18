class demo
{
void add(int a,int b)
{
int c=a+b;
System.out.println("add="+c);
}
void add(int a,float b)
{
float c=a+b;
System.out.println("add="+c);
}
void add(int a,int b,int r)
{
int c=a+b+r;
System.out.println("add="+c);
}
public static void main(String arg[])
{
demo ob=new demo();
ob.add(90,99);
ob.add(100,99f);
ob.add(9,9,9);
}
}