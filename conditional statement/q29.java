import java.util.Scanner;
public class q29{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a%10;
        int d=b%10;
        if(c==d){
            System.out.println("the last digit of 2years are same ");
        }
        else{
            System.out.println("the last digit of 2years are  not same ");
        }
    }
}