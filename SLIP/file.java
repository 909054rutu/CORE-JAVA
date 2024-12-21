import java.util.*;
class demo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
String s=sc.next();
for(int i=0;i<s.length();i++){
if(s.charAt(i)=='a'||s.charAt(i)=='e'){
System.out.println(""+s.charAt(i));
}
}
}
}