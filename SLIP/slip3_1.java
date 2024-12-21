public class slip3_1{
static void armstrong(int n){
int n1=n;
int s=0,d;
while(n>0){
d=n%10;
s=s+d*d*d;
n=n/10;
}
if(s==n1){
System.out.println("Number is Aramstrong");
}else{
System.out.println("Number is Not Armstrong");
}
}
public static void main(String args[]){
//slip3_1 ob=new  slip3_1();
armstrong(153);
}
}
