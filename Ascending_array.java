import java.util.*;
class Ascending_Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0,temp=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>temp){
                temp=arr[i];
                count+=1;
            }
        }
        if(count==n){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}