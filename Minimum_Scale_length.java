import java.util.*;
class MinimumScale{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int found=0,min=9999;
        int[] scales= new int[n];
        for(int i=0;i<n;i++){
            scales[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(min>scales[i]){min=scales[i];}
        }
        for(int i=min;i>=1;i--){
            found=0;
            for(int j=0;j<n;j++){
                if(scales[j]%i!=0){
                    found=1;
                    break;
                }
            }
            if(found==0){
                System.out.print(i);
                break;
            }
        }
    }
}