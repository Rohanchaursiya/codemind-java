import java.util.Scanner;
class HandshakeNumber
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        
        
        System.out.println(a*(a-1)/2);
        
        sc.close();
    }
}