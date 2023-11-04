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
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        int l=s.length();
        int t=n;
        int c=0;
        while(t!=0){
            if(isPrime(t%10)){
                c++;
            }
            t/=10;
        }
        if(isPrime(n) && c==l){
            System.out.println("Mega Prime");
        }else{
            System.out.println("Not Mega Prime");
        }
    }
}
