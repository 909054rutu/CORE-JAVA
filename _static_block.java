class demo
{
void show()
{
System.out.println("I AM SHOW!!!!!!!!!!!!!!!!!!!!");
}
static
{
System.out.println("I AM STATIC!!!!!!!!!!!!!!!!!!!!");
//firstly called static block before main function
} 
public static void main(String arg[])
{
System.out.println("I AM MAIN!!!!!!!!!!!!!!!!!!!!");
demo ob=new demo();
ob.show();
}
}