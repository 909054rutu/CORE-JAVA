class demo
{
void area(double r)
{
double a=3.14*r*r;
System.out.println("Area of circle="+a);
}
void area(float h,float b)
{
float a=0.5f*h*b;
System.out.println("Area of Triangle="+a);
}
public static void main(String arg[])
{
demo ob=new demo();
ob.area(7.9);
ob.area(7.9f,7.90f);
}
}