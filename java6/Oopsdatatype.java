import java.util.*;
class Oopsdatatype
{
    public static void main(String []args)
    {
        int a=10;
        Integer I=Integer.valueOf(a);//this is conver primitive to non-primitive datatype
        System.out.println(I);

        Integer x=new Integer(50);//this is conver non-primitive to primitive datatype
        Integer x1=new Integer(100);
        int u=x+x1;
        System.out.println(u);

        String s,r;
        s="100";r="200";
        int b=Integer.parseInt(s);//this is convert String to primitive data type
        int c=Integer.parseInt(r);//this is convert String to primitive data type
        int d=b+c;
        System.out.println(d);

        Scanner input=new Scanner(System.in);
        String st=input.next();
        String st1=input.next();
        int value=Integer.parseInt(st);
        int value1=Integer.parseInt(st1);
        int sum=value+value1;
        System.out.println(sum);
        input.close();
    }
}