import java.util.Scanner;
public class q17{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a%10;
        int d=b%10;
        if(c==d){
            System.out.println("the last digit of two numbers are same");
        }
        else{
            System.out.println("the last digit of two numbers are not same");
        }
    }
}