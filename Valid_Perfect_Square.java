import java.util.*;
class MinimumScale{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
        int i=0,c=0;
        while(i<=Math.sqrt(n)){
            if(Math.pow(i,2)==n){
                c=1;
                break;
            }
            else{
                c++;
            }
            i++;
        }
        if(c==1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        }
        
    }
}