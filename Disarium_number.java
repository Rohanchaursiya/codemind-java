import java.util.*;
class Disarium_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int c=0;
        while(n!=0){
            c+=1;
            n/=10;
        }
        int rem,sum=0;
        n=m;
        while(n!=0){
            rem=n%10;
            sum+=Math.pow(rem,c);
            n/=10;
            c-=1;
        }
        if(sum==m){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}