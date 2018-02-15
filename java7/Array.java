class Array
{
    public static void main(String []args)
    {
        int a[][]=new int[2][];
        a[0]=new int[3];
        a[1]=new int[2];
        a[0][0]=20;
        a[0][1]=30;
        a[0][2]=40;
        a[1][0]=50;
        a[1][1]=60;
        for(int i=0;i<=a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
}