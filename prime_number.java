import java.util.Scanner;
class SumOfTwoNumber{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count==1){
            System.out.print("prime");
        }
        else{
            System.out.print("not a prime");
        }
    }
}