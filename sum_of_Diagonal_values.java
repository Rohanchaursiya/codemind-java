import java.util.*;
class Sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[10][10];
        int sum=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                a[i][j]=sc.nextInt();
                if(i==j||i+j==n+1 ){
                    sum+=a[i][j];
                }
            }
        }
        System.out.print(sum);
        sc.close();
    }
}