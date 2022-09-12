import java.util.Scanner;
class FahrenhietToCelcius
{
    public static void main(String args[])
    {
        float c;
        float fa;
        
        Scanner sc=new Scanner(System.in);
        fa=sc.nextFloat();
        
        c=5*(fa-32)/9;
        
        System.out.format("%.2f",c);
        
        sc.close();
    }
}