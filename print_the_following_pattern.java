import java.util.*;
class Pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-2);j++){
               System.out.print(j); 
            }
            int c=1;
            for(int k=1;k<=n-3;k++){
                System.out.print(c);
                c++;
            }
            System.out.println("");
        }
    }
}