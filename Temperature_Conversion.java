import java.util.Scanner;
class AreaOfCircle
{
    public static void main(String args[])
    {
        float c;
        float fa;
        
        Scanner sc=new Scanner(System.in);
        c=sc.nextFloat();
        
        fa=32+((c*9)/5);
        
        System.out.format("%.2f",fa);
        
        sc.close();
    }
}