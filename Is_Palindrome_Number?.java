import java.util.Scanner;
class CanRobberEscape
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n!=0){
            sum=sum*10+(n%10);
            n=n/10;
        }
        if(temp==sum){
            System.out.print("2");
        }
        else{
            System.out.print("1");
        }
    }
}