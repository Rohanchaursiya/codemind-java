import java.util.*;
class Majority{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0,temp;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp=arr[i]; 
                arr[i]=arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" "); 
        }
    }
}