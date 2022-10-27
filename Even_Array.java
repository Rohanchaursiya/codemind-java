import java.util.*;
class Even_Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                count+=1;
            }
        }
        if(count==n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}