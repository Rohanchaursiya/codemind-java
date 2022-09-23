import java.util.Scanner;
class PrimePalindrome{
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        num=num+1;
        int rem,sum1=0,temp,i,sum2=0;
        while(num!=0){
            sum1=0;
            num++;
            temp=num;
            while (temp!=0){
                rem=temp%10;
                sum1=rem+sum1*10;
                temp=temp/10;
            }
            if (num==sum1){
                sum2=0;
                for (i=1;i<=num;i++){
                    if (num%i==0){
                        sum2++;
                    }
                }
                if (sum2==2){
                    System.out.print(num);
                    return ;
                }
            }
        }
    }
}