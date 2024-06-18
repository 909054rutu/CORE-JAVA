class demo
{
static int a=0;
static void show()
{
a++;
System.out.println("no of="+a);
}
public static void main(String arg[])
{
demo ob=new demo();
ob.show();
ob.show();
}
}