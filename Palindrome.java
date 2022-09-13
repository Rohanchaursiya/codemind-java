import java.util.Scanner;
class AbundantNumber{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp;
        temp=n;
        int sum=0;
        while(n!=0){
            sum=(sum*10)+(n%10);
            n/=10;
        }
        
        if(sum==temp){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}