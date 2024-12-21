import java.io.*;
class file{
public static void main(String args[])throws Exception
{
FileInputStream f1=new FileInputStream("sss.txt");
FileOutputStream f2=new FileOutputStream ("rrr.txt");
int k=0;
while((k=f1.read())!=-1)
{
f2.write(k);
}
f1.close();
f2.close();
System.out.println("Copy Succe");
}
}
