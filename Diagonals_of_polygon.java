import java.util.Scanner;
class DiagonalsOfPolygon{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        System.out.print(n*(n-3)/2);
    }
}