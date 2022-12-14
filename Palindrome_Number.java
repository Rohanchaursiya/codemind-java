import java.util.*;
class Palindrome_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int m=n;
            int sum=0;
            while(n!=0){
                sum=sum*10+(n%10);
                n/=10;
            }
            if(sum==m){
                System.out.println("True");
                }else{
                    System.out.println("False");
                }
        }
    }
}