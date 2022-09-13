import java.util.Scanner;
class StrongNumber{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n;
        int r,sum=0;
        while(n!=0){
            r=n%10;
            int i=1,fact=1;
            while(i<=r){
                fact*=i;
                i+=1;
            }
            sum+=fact;
            n/=10;
        }
        if(sum==temp){
            System.out.print("The number "+sum+" is a strong number");
        }
        else{
            System.out.print("The number "+temp+" is not a strong number");
        }
    }
}