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
        int num=0;
        for(int i=0;i<n;i++){
            int count=0;
            while(arr[i]!=0){
                arr[i]=arr[i]/10;
                count+=1;
            }
            if(count%2==0){
                    num+=1;
                }
        }
        System.out.print(num);
    }
}