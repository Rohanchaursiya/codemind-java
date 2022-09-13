import java.util.Scanner;
class HappyNumber{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int s=0,r;
        while(s!=1&&s!=4){
            s=0;
            while(n!=0){
                r=n%10;
                s=s+(r*r);
                n=n/10;
            }
            n=s;
        }
        if(s==1){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}