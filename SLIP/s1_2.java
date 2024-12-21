import java.io.*;
class demo{
public static void main(String args[])throws Exception
{
FileInputStream f1=new FileInputStream("srk.txt");
FileOutputStream f2=new FileOutputStream("uml.txt");
int k=0;
while((k=f1.read())!=-1){
if(!(k>='0' && k<='9')){
f2.write(k);
}
}
f1.close();
f2.close();
System.out.println("File copy succefully");
}
}