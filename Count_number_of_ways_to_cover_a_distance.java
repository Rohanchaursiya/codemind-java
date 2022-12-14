import java.util.*;
class Cover_Distance{
    public static int Tot_way(int n)
    {
        if (n<0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        return Tot_way(n-1)+Tot_way(n-2)+Tot_way(n-3);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(Tot_way(n));
    }
}