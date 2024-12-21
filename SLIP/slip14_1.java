class demo{
int power(int x,int y)
{
if(y==0)
return 1;
else
return x*power(x,y-1);
}
public static void main(String args[]){
demo ob=new demo();
System.out.println(""+ob.power(2,5));
}

}