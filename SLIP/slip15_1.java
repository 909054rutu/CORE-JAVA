class demo{
public static void main(String args[]){
String[] name={"rutuja","swami","samrth"};
int index=-1;

String sname="swami";
for(int i=0;i<name.length;i++)
{
if(name[i].equals(sname)){
index=i;
break;
}
}
if(index!=-1){
System.out.println("found"+index);
}else{
System.out.println("Not found");
}
}
}