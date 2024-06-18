class area
{
float a;
void circle(float r)
{
a=3.14f*r*r;
System.out.println("Area of coircle="+a);
}
void rectangle(float l,float b)
{
a=l*b;
System.out.println("Area of rectangle="+a);
}
void square(int n)
{
a=n*n;
System.out.println("square="+a);
}
void cube(int n)
{
a=n*n*n;
System.out.println("Cube="+a);
}

public static void main(String arg[])
{
area ob;
ob=new area();//memory allocation
ob.circle(8.3f);
ob.rectangle(8.3f,5.7f);
ob.square(9);
ob.cube(3);
}
}