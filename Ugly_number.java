import java.util.Scanner;
class SumOfTwoNumber{
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
         while(num!=1){
            if(num%2==0)
            {
             num=num/2;
            }
            else if(num%3==0)
            {
             num=num/3;
            }
            else if(num%5==0)
            {
             num=num/5;
            }
            else
            {
                System.out.print("Not Ugly Number");
                System.exit(1);
            }
        }
    System.out.print("Ugly Number");
       
    }
}