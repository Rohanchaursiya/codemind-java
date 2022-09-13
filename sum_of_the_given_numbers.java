import java.util.Scanner;
class SumOfTwoNumber{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i=1;
        int a,b;
        while(i<=n){
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a+b);
        }
       
    }
}