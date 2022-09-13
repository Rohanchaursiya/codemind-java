import java.util.Scanner;
class SpyNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        int pdct=1,sum=0;
        while(0<num){
            pdct*=(num%10);
            sum+=(num%10);
            num=num/10;
        }
        if(pdct==sum){
            System.out.print("Spy Number");
        }
        else{
            System.out.print("Not Spy Number");
        }
        
    }
}