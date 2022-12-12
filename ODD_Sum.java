import java.util.*;
class Absolute{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int o=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0){
                o+=arr[i];
            }
        }
        System.out.println(o);
    }
}