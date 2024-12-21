import java.io.*;
import java.util.*;

class demo{
public static void main(String args[]){
ArrayList a=new ArrayList();
Scanner sc=new Scanner(System.in);
System.out.println("Enter limit");
int n=sc.nextInt();
for(int i=0;i<n;i++){
int num=sc.nextInt();
a.add(num);
}
System.out.print("Array"+a);
Collections.reverse(a);
System.out.print("Array"+a);
}

}