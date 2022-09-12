import java.util.Scanner;
class AverageIsInArray
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        int l,b,w,c;
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
       System.out.print(((((l+2*w)*(b+2*w))-(l*b))*c));
    sc.close();
    }
}