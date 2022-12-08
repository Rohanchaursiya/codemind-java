import java.util.*;
class Smaller{
    public static void printSmaller(int arr[],int n){
        for (int i=0;i<n;i++){
            int j;
            for (j=i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(j==-1){
                System.out.print("-1"+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printSmaller(arr,n);
    }
}