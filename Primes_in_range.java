import java.util.*;
class Prime_Num{
    static int PrimeNumber(int n){
        if(n==1){
            return 0;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int c=0;
        for(int i=m;i<=n;i++){
            if(PrimeNumber(i)==1){
                c++;
            }
        }
        System.out.print(c);
    }
}