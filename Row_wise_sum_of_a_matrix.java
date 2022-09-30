import java.util.*;
class Sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[10][10];
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                sum+=a[i][j];
            }
            System.out.print(sum+" ");
        }
        
    }
}