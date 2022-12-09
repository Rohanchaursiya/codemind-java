import java.util.*;
class Matrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        int temp=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<n;j++){
            int sum=0;
            for(int i=0;i<m;i++){
                sum+=arr[i][j];
            }
            if(sum>temp){
                temp=sum;
            }
        }
        System.out.println(temp);
    }
}