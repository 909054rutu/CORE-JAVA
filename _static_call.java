class demo
{
static void add(int a,int b)
{
int c=a+b;
System.out.println("Addition="+c);
}
public static void main(String arg[])
{
add(88,100);//using function name
demo.add(100,200);//using class name
demo ob=new demo();
ob.add(99,91);//using object name

}
}