import java.util.*;
class sub
{
    int rno,m1,m2,m3,m4,m5,m6,t;
    String name;
    float p;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        name=sc.next();
        System.out.println("enter rno");
        rno=sc.nextInt();
        System.out.println("enter six sub marks!!!!");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5=sc.nextInt();
        m6=sc.nextInt();
    }
    void cal()
    {
        t=m1+m2+m3+m4+m5+m6;
        p=(float)t/6;

    }
    void disp()
    {
        System.out.println("Name="+name);
        System.out.println("Rno="+rno);
        System.out.println("Total="+t);
        System.out.println("Per="+p);
    }
    public static void main(String arg[])
    {
        sub ob=new sub();
        ob.accept();
        ob.cal();
        ob.disp();

    }
}