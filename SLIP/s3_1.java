
import java.util.*;
class s3_1{
static void aramstrong(){
Scanner sc=new Scanner(System.in);
System.out.print("Enter Number");
int n=sc.nextInt();
int d,s=0;
int num=n;
while(n>0){
d=n%10;
s=s+d*d*d;
n=n/10;
}
if(num==s){
System.out.print("Number is aramstrong");
}else{
System.out.println("Number is not armstrong");
}
}
public static void main(String args[]){
s3_1 ob=new s3_1();
ob.aramstrong();
}
}