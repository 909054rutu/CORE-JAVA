import java.io.*;
class file
{
public static void main(String args[])throws Exception
{
int i;
for(i=0;i<args.length;i++){
File f=new File(args[i]);
if(f.isFile())
{
String name=f.getName();

System.out.println("File location:"+f.getAbsolutePath());
System.out.println("File Size:"+f.length()+"Bytes");

if(name.endsWith(".txt"))
{
f.delete();
System.out.println("delete name="+f.getName());
}
else
System.out.println("Not Found");
}
}
}
}