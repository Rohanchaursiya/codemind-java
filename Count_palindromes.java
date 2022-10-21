import java.util.*;
class CountPalindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0,num;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            num=arr[i];
            int r,sum=0;
            while(num!=0){
                r=num%10;
                sum=sum*10+r;
                num/=10;
            }
            if(arr[i]==sum){
                count+=1;
            }
        }
        System.out.print(count);
    }
}