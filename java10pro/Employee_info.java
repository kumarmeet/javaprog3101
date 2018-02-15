package employeepf;
import java.util.*;

abstract class Abstract
{
    private String name;
    protected float salary;
    public void setName(String n)
    {   name=n;   }
    public void setSalary(float s)
    {   salary=s; }
    public void showName()
    {System.out.println("Employee Name is: "+name);}
    public void showSalary()
    {System.out.println("Employee Salary is: "+salary);}
}
class Class_1st_Employee extends Abstract
{
    private float pf;
    public void calPF()
    {pf=(salary/100)*12;}
    public void showPF()
    {System.out.println("Class 1st Employee PF Amount is: "+pf+"\n");}
}
class Class_2nd_Employee extends Abstract
{
    private float pf;
    public void calPF()
    {pf=(salary/100)*13;}
    public void showPF()
    {System.out.println("Class 2nd Employee PF Amount is: "+pf);}
}
final class Test extends Class_2nd_Employee
{
    public void test()
    {
        System.out.print("For class 1st employee press-[1] or class 2nd empoyee press-[2]: ");
        int input;
        char ch;
        boolean isNumber;
        Scanner scan=new Scanner(System.in);
        do{
            if (scan.hasNextInt())
            {
                input=scan.nextInt();
                isNumber=true;
        switch(input)
        {
            case 1:
            Scanner next=new Scanner(System.in);
            System.out.println("Welcome you are entered in class 1st employee");
            do{
                Scanner input1=new Scanner(System.in);
                System.out.println("How many entry you want: ");
                byte class_1st=input1.nextByte();
                Class_1st_Employee cs1[]=new Class_1st_Employee[class_1st];
                for(int i=0;i<cs1.length;i++)
                {
                    cs1[i]=new Class_1st_Employee();
                    Scanner emp1=new Scanner(System.in);
                    System.out.print("Enter [" +i+ "] Employee Name: ");
                    String name=emp1.nextLine();
                    cs1[i].setName(name);
                    System.out.print("Enter [" +i+ "] Employee Salary: ");
                    float salary=emp1.nextFloat();
                    cs1[i].setSalary(salary);
                }
                for(int j=0;j<cs1.length;j++)
                {
                    cs1[j].showName();
                    cs1[j].showSalary();
                    cs1[j].calPF();
                    cs1[j].showPF();
                }
                System.out.print("Do you want to go to class 1st employee entry then press [y] or [Y]: ");
                ch=next.next().charAt(0);
            }while(ch=='y'||ch=='Y');
            break;
            case 2:
            Scanner next1=new Scanner(System.in);
            System.out.println("Welcome you are entered in class 2nd employee");
            do{
                Scanner input2=new Scanner(System.in);
                System.out.println("How many entry you want: ");
                byte class_2nd=input2.nextByte();
                Class_2nd_Employee cs2[]=new Class_2nd_Employee[class_2nd];
                for(int i=0;i<cs2.length;i++)
                {
                    cs2[i]=new Class_2nd_Employee();
                    Scanner emp2=new Scanner(System.in);
                    System.out.print("Enter [" +i+ "] Employee Name: ");
                    String name=emp2.nextLine();
                    cs2[i].setName(name);
                    System.out.print("Enter [" +i+ "] Employee Salary: ");
                    float salary=emp2.nextFloat();
                    cs2[i].setSalary(salary);
                }
                for(int j=0;j<cs2.length;j++)
                {
                    cs2[j].showName();
                    cs2[j].showSalary();
                    cs2[j].calPF();
                    cs2[j].showPF();
                }
                System.out.print("Do you want to go to class 2nd employee entry then press [y] or [Y]: ");
                ch=next1.next().charAt(0);
            }while(ch=='y'||ch=='Y');
            break;
            default:
            System.out.print("This Type of class we don't have sorry!");
          }   
        }
            else{
                System.out.println("I dont understand you");
                isNumber=false;
                scan.next();
            }
        }while(!(isNumber));
    }
    int password;
}
class Employee_info
{
    public static void main(String []args)
    {
        Test t1=new Test();
        Scanner password_input=new Scanner(System.in);
        while(t1.password!=12345)
        {
            System.out.print("Input Password-> 12345:   ");
            t1.password=password_input.nextInt();
            if(t1.password!=12345)
            {
                System.out.println("Try Again!");
            }
        }
        t1.test();
        password_input.close();
    }
}