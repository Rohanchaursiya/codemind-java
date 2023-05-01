import java.util.*;
public class Third_Maximum_Number{
    public static void MaximumNumber(int arr[],int n){
        int max=-1;
        if(n<=2){
            for(int i=0;i<n;i++){
                max=Math.max(max,arr[i]);
            }
            System.out.println(max);
        }
        else{
            int first = arr[0];
            for (int i = 1;i <n; i++)
                if (arr[i] > first)
                    first = arr[i];
            int second = Integer.MIN_VALUE;
            for (int i = 0;i <n; i++)
                if (arr[i] > second &&
                    arr[i] < first)
                    second = arr[i];
            int third = Integer.MIN_VALUE;
            for (int i = 0;i <n; i++)
                if (arr[i] > third &&
                    arr[i] < second)
                    third = arr[i];
            System.out.println(third);
        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        MaximumNumber(a,n);
        
    }
}