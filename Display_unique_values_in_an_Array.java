import java.util.*;
class Unique{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]&& i!=j){
                    count+=1;
                }
            }
            if(count==0){
                System.out.print(arr[i]+" ");
                c+=1;
                
            }
        }
        if(c==0){
            System.out.print("-1");
        }
    }
}