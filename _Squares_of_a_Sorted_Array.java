import java.util.*;
public class Square_Of_Sorted_Arrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(a[i]*a[i]);
        }
        Collections.sort(li);
        for(int i=0;i<n;i++){
            System.out.print(li.get(i)+" ");
        }
    }
}