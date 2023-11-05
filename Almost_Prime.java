import java.util.*;
public class Min_Max{
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
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=99999,mini=0;
        for(int i=0;i<n;i++){
            if(a[i]<min ){
                min=a[i];
                mini=i;
            }
        }
        int max=-99999,maxi=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
                maxi=i;
            }
        }
        int c=0;
        if(mini<maxi){
            for(int i=mini;i<=maxi;i++){
                if(isPrime(a[i])){
                    c++;
                }
            }
        }else{
            for(int i=maxi;i>=mini;i--){
                if(isPrime(a[i])){
                    c++;
                }
            }
        }
        
        System.out.println(c);
    }
}
