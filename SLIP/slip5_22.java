import java.io.*;
class file{
public static void main(String args[])throws Exception
{
int i;
for(i=0;i<args.length;i++){
File f1=new File(args[i]);
if (f1.isFile())
{
String name=f1.getName();
System.out.println("File location:"+f1.getAbsolutePath());
System.out.println("File Size"+f1.length()+"Bytes");

if (name.endsWith(".txt")){
System.out.println("delete file name:"+f1.getName());
}else{
System.out.println("File not found");
}
}
}
}
}