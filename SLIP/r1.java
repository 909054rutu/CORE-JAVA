

import java.io.*;
public class file{
FileInputStream f1=new FileInputStream("rss.txt");
FileOutputStream f2=new FileOutputStream("ssr.txt");
int k=0;
while(k=(f1.read())!=-1){
f2.write(k);
}
f1.close();
f2.close();
System.out.println("copy succefulyy");
}

