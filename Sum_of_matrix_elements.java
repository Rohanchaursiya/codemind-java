import java.util.Scanner;
class Sum{
    public static void main(String args[]){
        int m,n;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int[][] arr=new int[100][100];
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }   
}