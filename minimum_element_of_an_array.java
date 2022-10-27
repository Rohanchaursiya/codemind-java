import java.util.*;
class Even_Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int temp=999;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<temp){
                temp=arr[i];
            }
        }
        System.out.println(temp);
    }
}