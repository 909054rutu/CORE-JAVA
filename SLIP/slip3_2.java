abstract class shape{
abstract void area();
abstract void volume();
}
class cone extends shape{
void area(){
float r=3.5f;
float area_c=3.15f*r*r;
System.out.println("Area of cone="+area_c);
}
void volume(){
//float r=3.5f;
float volume_c=1.5f*3.5f*r*r;
System.out.println("volume of cone="+volume_c);
}
}
class demo{
public static void main(String args[]){
cone ob=new cone();
ob.area();
ob.volume();
}

}