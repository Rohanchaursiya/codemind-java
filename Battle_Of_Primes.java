import java.util.*;
public class Battle_Of_primes{
    public static Boolean isPrime(int n){
        if(n==0 || n==1){return false;}
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int m=n1+n2;
        for(int i=1;i<=9;i++){
            if(isPrime(m+i)){
                System.out.println(i);
                break;
            }
        }
    }
}
