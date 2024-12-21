// Define an abstract class Shape with abstract methods area () and volume (). Derive
//abstract class Shape into two classes Cone and Cylinder. Write a java Program
//to calculate area and volume of Cone and Cylinder.(Use Super Keyword.)

abstract class shape{
abstract void area();
abstract void volume();
float r=2.4f;
}
class cone extends shape{
void area(){
float ac=super.r*super.r*2.5f;
System.out.println("Area of cone="+ac);
}
void volume()
{
float cv=3.14f*super.r;
System.out.println("Area of cone="+cv);
}
public static void main(String args[]){
cone ob=new cone();
ob.area();
ob.volume();
}
}