import java.util.*;
class Pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int j=i-1;j>0;j--){
                System.out.print(j);
            }
            for(int j=0;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}