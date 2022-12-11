import java.util.*;
class Appy{
    public static long gcd(long a,long b){
        if(a==0){
            return b;
        }
        else{
            return (gcd(b%a,a));
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            long n=sc.nextLong();
            long a=sc.nextLong();
            long b=sc.nextLong();
            long k=sc.nextLong();
            long count=0;
            long lcm = a*b/gcd(a,b);
    		long ans = n/a + n/b - 2*(n/lcm);
    		System.out.println(ans>=k?"Win":"Lose");
    		t--;
        }
    }
}