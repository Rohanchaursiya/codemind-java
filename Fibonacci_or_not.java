import java.util.*;
class Fibonacci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c=0;
        while(c<=n){
            c=a+b;
            a=b;
            b=c;
            if(c==n){
                System.out.println("True");
                break;
            }
        }
        if(c!=n){
            System.out.println("False");
        }
    }
}