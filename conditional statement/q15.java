import java.util.Scanner;
public class q15{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a%3==0)|(a%7==0)){
            System.out.println("It is divisible by either 3 and 7 ");
        }
        else{
            System.out.println("It is not divisible");
        }
    }
}