import java.util.Scanner;
class Gcd{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int r,l=0;
        while(n!=0){
            r=n%10;
            if(l<r){
                l=r;
            }
            n/=10;
        }
        System.out.print(l);
    }
}