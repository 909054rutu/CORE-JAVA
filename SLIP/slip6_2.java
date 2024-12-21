import java.util.*;

class demo{
public static void main(String args[]){
int m,n,i,j;
int a[][]=new int[10][10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter row and column");
m=sc.nextInt();
n=sc.nextInt();
for(i=0;i<m;i++)
for(j=0;j<n;j++)
a[i][j]=sc.nextInt();

System.out.println("Display original matrix");
for(i=0;i<m;i++){
for(j=0;j<n;j++){
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
System.out.println("Display trancpose matrix");
for(i=0;i<n;i++){
for(j=0;j<m;j++){
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
}