import java.util.Scanner;
class AreaOfCircle
{
    public static void main(String args[])
    {
        int r;
        
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        
        System.out.format("%.2f",3.14*r*r);
        
        sc.close();
    }
}