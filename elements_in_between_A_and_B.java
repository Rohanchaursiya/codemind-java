import java.util.*;
class Max_Num{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=a && arr[i]<=b){
                count+=1;
                System.out.print(arr[i]+" ");
            }
        }
        if(count==0){
            System.out.println("-1");
        }
    }
}