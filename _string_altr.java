import java.util.*;
class demo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
String s1=sc.nextLine();
System.out.println("ALTERNATE");
for(int i=0;i<s1.length();i=i+2)
//System.out.println(s1.charAt(i));
System.out.printf("%c",s1.charAt(i));
}
}
