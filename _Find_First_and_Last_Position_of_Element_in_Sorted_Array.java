import java.util.*;
class Winner{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        Arrays.sort(arr);
        int c=-1,d=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==t){
                c=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==t){
                d=i;
                break;
            }
        }
            System.out.print(c+" "+d);
    }
}