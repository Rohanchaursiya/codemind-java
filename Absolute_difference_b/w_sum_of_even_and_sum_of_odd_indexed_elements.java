import java.util.*;
class Absolute{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int e=0,o=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(i%2==0){
                e+=arr[i];
            }
            else{
                o+=arr[i];
            }
        }
        System.out.println(Math.abs(e-o));
    }
}