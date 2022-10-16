import java.util.*;
class Element_Search{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int e=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==e){
                count+=1;
            }
        }
        if(count==0){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
}