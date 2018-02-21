interface practice{
    void show();
}
interface tt extends practice{
    void pri();
}
class A implements practice{
    public void show(){
        System.out.println("A");
    }
    public void show1(){
        System.out.println("A1");
    }
}
class B extends A implements tt{
    public void show2(){
        System.out.println("B");
    }
    public void pri(){
        System.out.println("B1");
    }
}
class Test{
    public static void main(String []args){
        
        practice pra=new A();
        pra.show();

        A b=new B();
        b.show();
        b.show1();

        B a=new B();
        a.show2();
        a.pri();
        tt t=new B();
        t.pri();
        t.show();
    }
}