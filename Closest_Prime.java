import java.util.*;
public class Closest_Palindrome{
    public static boolean isPalin(int n){
        int sum=0,m=n;
        while(m!=0){
            sum=sum*10+(m%10);
            m/=10;
        }
        if(sum==n){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n-1;
        int bp=0;
        while(m>=0){
            if(isPalin(m)){
                bp=m;
                break;
            }
            m--;
        }
        int lp=n*n;
        int p=n+1;
        int np=0;
        while(p<=lp){
            if(isPalin(p)){
                np=p;
                break;
            }
            p++;
        }
        if(Math.abs(bp-n) == Math.abs(np-n)){
            System.out.println(bp+" "+np);
        }else{
            int ans=0;
            if(Math.abs(bp-n)<Math.abs(np-n)){
                ans=bp;
            }else{
                ans=np;
            }
            System.out.println(ans);
        }
    }
}
