import java.util.*;
class demo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
String s1=sc.nextLine();
StringBuffer s2=new StringBuffer(s1);
s2.reverse();

if(s1.equals(s2.toString()))
System.out.println("String is Palindrome");
else
System.out.println("String is not Palindrome");

}
}
