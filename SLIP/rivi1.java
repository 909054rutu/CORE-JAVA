import java.io.*;
class demo
{
public static void main(String args[]){
try
{
FileInputStream f1=new FileInputStream("abc.txt");
FileOutputStream f2=new FileOutputStream("xyz.txt");
int k;
while((k=f1.read())!=-1)
{
if(!(k>='0'&& k<='9'))
f2.write(k);
}
f1.close();
f2.close();
System.out.println("Copy Content Succ");
}
catch(Exception e){
System.out.println("Error="+e);
}
}
}