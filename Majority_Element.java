import java.util.*;
class Majority{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n/2;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]&& i!=j){
                    count+=1;
                }
            }
            if(count>=m){
                System.out.print(arr[i]);
                break;
            }
        }
    }
}