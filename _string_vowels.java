import java.util.*;
class demo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
String s1=sc.nextLine();

System.out.println("vowels");
for(int i=0;i<s1.length();i++)
{
//ch=s1.charAt(i);
//if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='uch=='A'||
//ch=='E'||ch=='I'||ch=='O'||ch=='U')
if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
System.out.printf("%c",s1.charAt(i));
}

}
}
