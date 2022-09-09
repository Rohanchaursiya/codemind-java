import java.util.Scanner;
class AssciValue
{
    public static void main(String args[])
    {
        char a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine().charAt(0);
        
        System.out.print((int)a);
        
        sc.close();
    }
}