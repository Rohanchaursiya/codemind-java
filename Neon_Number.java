import java.util.Scanner;
class SpyNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int m;
        m=n*n;
        int sum=0;
        while(m!=0){
            sum+=(m%10);
            m/=10;
        }
        if(n==sum){
            System.out.print("Neon Number");
        }
        else{
            System.out.print("Not Neon Number");
        }
        
    }
}