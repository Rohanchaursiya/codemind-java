import java.util.*;
public class Closest_Palindrome{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int rev(int n){
        int s=0;
        while(n!=0){
            s=s*10+(n%10);
            n/=10;
        }
        return s;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rn=rev(n);
        if(isPrime(n) && isPrime(rn)){
            System.out.println("circular prime");
        }else if((isPrime(n) && isPrime(rn)==false) || (isPrime(n)==false && isPrime(rn))){
            System.out.println("prime but not a circular prime");
        }else{
            System.out.println("not prime");
        }
    }
}
