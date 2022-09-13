import java.util.Scanner;
class AutomorpicNumber{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int m;
        m=n*n;
        int count=0;
        while(n!=0){
            if((n%10)!=(m%10)){
                System.out.print("Not an Automorphic Number");
                count=1;
                break;
            }
            n=(int)n/10;
            m=(int)m/10;
        }
        if(count==0){
            System.out.print("Automorphic Number");
        }
    }
}