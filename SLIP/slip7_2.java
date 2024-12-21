//Write a java program to accept details of ‘n’ cricket player (pid, pname, totalRuns,
//InningsPlayed, NotOuttimes). Calculate the average of all the players. Display the
//details of player having maximum average. (Use Array of Object) ;

import java.util.*;
class demo{
int pid,totr,ip;
String name;
float batAvg;
void accept(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter pid");
pid=sc.nextInt();
System.out.println("Enter totr");
totr=sc.nextInt();
System.out.println("Enter ip");
ip=sc.nextInt();
System.out.println("Enter name");
name=sc.next();
batAvg=totr/ip;
}
void disp(){
System.out.println("pid="+pid);
System.out.println("totr="+totr);
System.out.println("ip="+ip);
System.out.println("name="+name);
System.out.println("batAvg="+batAvg);
}
}
class print{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter limit");
int n=sc.nextInt();
demo ob[]=new demo[n];
for(int i=0;i<n;i++){
ob[i]=new demo();
ob[i].accept();
}
float max=ob[0].batAvg;
int index=0;
for(int i=1;i<n;i++){
if(max<ob[i].batAvg){
max=ob[i].batAvg;
index=i;
}
ob[index].disp();
}
}
}