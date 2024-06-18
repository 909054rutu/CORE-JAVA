class demo
{
int a=100;
void show()
{
int a=200;
System.out.print("No="+a);
System.out.println("No="+this.a);

}
public static void main(String arg[])
{
demo ob=new demo();
ob.show();
}
}