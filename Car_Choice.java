import java.util.*;
class Car_Choice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int y1=sc.nextInt();
            int y2=sc.nextInt();
            if((float)y1/x1<(float)y2/x2){
                System.out.println("-1");
            }
            else if((float)y1/x1==(float)y2/x2){
                System.out.println("0");
            }
            else {
                System.out.println("1");
            }
            t-=1;
        }
    }
}