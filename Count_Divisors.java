import java.util.Scanner;
class CountDivisior{
    public static void main(String args[]){
        int l,r,k;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        r=sc.nextInt();
        k=sc.nextInt();
        int count=0;
        for(int i=l;i<=r;i++){
            if(i%k==0){
                count+=1;
            }
        }
       System.out.print(count);
    }
}