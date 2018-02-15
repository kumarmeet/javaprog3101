import java.util.*;
class A{
    protected int bi;
}
class Password
{
    public static void main(String []args)
    {
        A obj=new A();
        Scanner scan=new Scanner(System.in);
        while(obj.bi!=12345)
        {
            System.out.println("Input number");
            obj.bi=scan.nextInt();
            if(obj.bi!=12345)
            {
                System.out.println("Wrong");
            }
        }
        System.out.println("Pass");
    }
}

/*Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        if(ch=='a'|| ch=='z')
        {
            System.out.println("Entered");
        }
        else
        {
            System.out.println("fired");
        }*/