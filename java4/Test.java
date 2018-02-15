package accessmodifiers;

import accessmodifiers.Modifiers.Inner;

interface I1
{
    String s1="Interface";
    void show();
    void sum();
}

class Modifiers implements I1
{
    public void show()
    {
        System.out.println(s1);
    }
    static void check()
    {
        System.out.println("Checked");
    }
                 class Inner
                    {
                     void showInner()
                        {
                            System.out.println("Static Inner");
                        }
                    } //end inner class
public void sum()
{
    System.out.println("SUM");
}
}

class Test
{
    public static void main(String []args)
    {
        Modifiers mo=new Modifiers();
        mo.show();
        Modifiers.check();
        Modifiers.Inner mInner=mo.new Inner();
        mInner.showInner();
        mo.show();
        /*****************Anonymous Class********************/
       I1 i1=new I1(){
        
            @Override
            public void sum() {
                int a,b,c;
                a=10;b=20;c=a+b;
                System.out.println(c);
            }
            @Override
            public void show() {
                System.out.println("Anonymous");
            }
        };//end of anonymous class
        i1.sum();
        i1.show();

    }
}