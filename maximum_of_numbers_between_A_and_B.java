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
        int temp=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=a && arr[i]<=b){
                if(arr[i]>temp){
                    temp=arr[i];
                }
            }
        }
        if(temp==0){
            System.out.println("-1");
        }
        else{
            System.out.println(temp);
        }
    }
}