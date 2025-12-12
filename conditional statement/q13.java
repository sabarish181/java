import java.util.Scanner;
public class q13{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
            System.out.println("It is positive");
        }
        else if(a==0){
            System.out.println("It is zero");
        }
        else{
            System.out.println("It is negative");
        }
    }
}