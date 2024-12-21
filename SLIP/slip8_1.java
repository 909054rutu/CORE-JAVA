
interface shape{
final float PI=3.14f;
abstract void area (float r);
}
class circle implements shape{
public void area(float r)
{
float ac=PI*r*r;
System.out.println("Area OF circle:"+ac);
}
}
class sphere implements shape{
public void area(float r)
{
float sc=4*PI*r*r;
System.out.println("Area OF circle:"+sc);
}
}
class demo{
public static void main(String args[]){
circle ob=new circle();
ob.area(3.4f);
sphere ob1=new sphere();
ob1.area(7.7f);
}
}