package userinput;

import java.util.*;

class User_input
{
    private int table;
    private void numberTable(int t)
    {
        table=t;
        System.out.println(table);
    }
     protected void numberTable1(int x)
    {
        numberTable(x);
    }
}

public class Inputed extends User_input
{
    int value;
    public void numberMultiply()
    {
        User_input uInput=new User_input();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for table: ");
        value=sc.nextInt();
        for(int i=1; i<=10; i++)
        {
            uInput.numberTable1(value*i);
        }
        sc.close();
    }
}


