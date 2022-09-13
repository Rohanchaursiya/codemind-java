import java.util.Scanner;
class Gcd{
    public static void main(String args[]){
        int n,m;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        while(m!=n){
            if(m>n){
                m=m-n;
            }
            else{
                n=n-m;
            }
        }
        System.out.print(m);
    }
}