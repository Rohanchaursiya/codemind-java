import java.util.*;
class NumberSmallerThanCurrentNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] arr=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(j=0;j<n;j++){
                if(arr[j]<arr[i]){
                    count+=1;
                }
            }
            System.out.print(count+" ");
        }
    }
}