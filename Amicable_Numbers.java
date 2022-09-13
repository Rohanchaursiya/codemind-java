import java.util.Scanner;
class AmicableNumber{
    public static void main(String args[]){
        int m,n;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int sum1=0,sum2=0;
        for(int i=1;i<m;i++){
            if(m%i==0){
                sum1+=i;
            }
        }
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum2+=i;
            }
        }
        if(sum2==m && sum1==n){
            System.out.print("Amicable");
        }
        else{
            System.out.print("Not Amicable");
        }
    }
}