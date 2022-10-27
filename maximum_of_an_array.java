import java.util.*;
class Max_of_Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int temp=0,c=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>temp){
                temp=arr[i];
                c+=1;
            }
        }
        if(c==0){
            System.out.println("-1");
        }
        else{
            System.out.println(temp);
        }
    }
}