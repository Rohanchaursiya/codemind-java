import java.util.Scanner;
class Color{
    public static void main(String args[]){
        char c;
        Scanner sc=new Scanner(System.in);
        c=sc.nextLine().charAt(0);

        if(c=='a'|| c=='e' || c=='i'|| c=='o' || c=='u'|| c=='A' || c=='E'|| c=='I' || c=='O'|| c=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}