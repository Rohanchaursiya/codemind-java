import java.util.*;
public class Replace_Elements{
    public static void nextGreatest(int arr[],int n){
        for(int i=0;i<n;i++) {
            int max_value=-1;
            for(int j=i+1;j<n;j++){
                max_value=Math.max(max_value,arr[j]);
            }
            arr[i]=max_value;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        nextGreatest(a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}