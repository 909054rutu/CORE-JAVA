class InvalidData extends Exception
{
public InvalidData(String msg){
super(msg);
//public string toString(){
//return "InvalidData";
}
}
public class slip9_2{
public static void main(String args[]){
try{
String panvalid="abc123";
String mobilevalid="9088776655";

validpan(panvalid);
vaildMob(mobilevalid);

System.out.println("pan no=",+panvaild);
System.out.println("mobile no=",+mobilevaild);
}catch (InvalidData e){
System.out.println("error"+e);
}
}
public static void validPan(String pan) throws InvalidData {
if(pan.matches("[A-Z]{4}[0-9]{5}")){
System.out.println("VALID PAN NO");
}else{
throw new Exception("Invalidpannumber");
}
}
public static void validMob(String mobile)throws InvalidData{
if(mobile.matches("[0-9]{10}")){
System.out.println("VALID mob NO");
}else{
throw new Exception("Invalidmobile");
}
}
}
}