import java.util.Scanner;
public class q16{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a%2==0)&&(a%5==0)&&(a%8!=0)){
            System.out.println("It is divisible by both 2 and 5 but not in 8 ");
        }
        else{
            System.out.println("It is not divisible");
        }
    }
}