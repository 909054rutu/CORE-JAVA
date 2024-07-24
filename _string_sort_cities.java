import java.util.*;
class demo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter limit");
int n=sc.nextInt();
String s1[]=new String[n];
for(int i=0;i<n;i++)
s1[i]=sc.next();

Arrays.sort(s1);
System.out.println("Sorted cities");
for(int i=0;i<n;i++)
System.out.printf("%s\t",s1[i]);




}
}
