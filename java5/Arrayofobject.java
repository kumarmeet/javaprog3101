package objectarray;
import java.util.*;
class A
{
    private String name;
    private double salary;
    private int ID;
    public void setBio(String n, double s,int id)
    {
            
            A obj[]=new A[5];
            for(int i=0;i<obj.length;i++)
            {
                Scanner sc=new Scanner(System.in);//this Scanner object will do fresh input if this is in loop
                obj[i]=new A();// obj[0]=new A();obj[1]=new A();obj[2]=new A();obj[3]=new A();obj[4]=new A();
                System.out.print("Enter name, salary and id: ");
                n=sc.nextLine();
                s=sc.nextDouble();
                id=sc.nextInt();
                name=n;salary=s;ID=id;
            }
    }
    public void showDetail()
    {
        System.out.println("Name:  "+name+"  Salary:  "+salary+"  ID:  "+ID);
    }
}
class Arrayofobject
{
    public static void main(String []args)
    {
       
        String n=" ";double s=0.0;int id=0;
        A emp_name_sal_id=new A();
        emp_name_sal_id.setBio(n, s, id);
        for(int i=0;i<5;i++)
        {
            obj1.showDetail();
        }
    }
}