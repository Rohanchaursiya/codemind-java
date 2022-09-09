import java.util.Scanner;
class AreaOfTriangle
{
    public static void main(String args[])
    {
        float a,b,c,s,A;
        
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        
        s=(a+b+c)/2;
        A=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.format("%.2f",A);
        
        sc.close();
    }
}