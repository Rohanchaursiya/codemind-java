import java.util.Scanner;
class ReverseNumber{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int sum=0;
        while(n!=0){
            sum=(sum*10)+(n%10);
            n/=10;
        }
        System.out.print(sum);
    }
}