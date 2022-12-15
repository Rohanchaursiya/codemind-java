import java.util.*;
class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0,c=0;
        for(int i=0;i<n;i++){
            c=0;
            if(a[i]>1){
                for(int j=2;j<=Math.sqrt(a[i]);j++){
                    if(a[i]%j==0){
                        c=1;
                        break;
                    }
                }
                if(c==0){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}