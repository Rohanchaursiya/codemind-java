import java.util.*;
class Preety_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int count=0;
        while(t!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int temp,rem;
            for(int i=a;i<=b;i++){
                temp=i;
                rem=temp%10;
                if(rem==2||rem==3||rem==9){
                    count+=1;
                }
            }
            System.out.println(count);
            count=0;
            t--;
            
        }

    }
}
