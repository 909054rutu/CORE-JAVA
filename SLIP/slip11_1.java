import java.util.*;
class demo{
public static void main(String args[]){
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
Scanner sc=new Scanner(System.in);
int ch;
do{
System.out.println("\n-1Addition\n-2substarction\n3-Multiplication\n3-division\n Enter choce");
ch=sc.nextInt();
switch(ch)
{
case 1:System.out.println("Addition"+(a+b));
break;
case 2:System.out.println("substarction"+(a-b));
break;
case 3:System.out.println("multiplication"+(a*b));
break;
case 4:System.out.println("division"+(a/b));
break;
}
}while(ch<5);
}
}