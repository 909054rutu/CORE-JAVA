import java.util.*;
class demo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter String");
String str=sc.next();
for(int i=0;i<str.length();i++){
if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||
str.charAt(i)=='O'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='U')
System.out.println(str.charAt(i));
}
}
}