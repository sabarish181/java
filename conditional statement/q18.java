import java.util.Scanner;
public class q18{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a>0)&&(a<10)){
            System.out.println("it is single digit number");
        }
        else if((a>9)&&(a<100)){
            System.out.println("it is double digit number");
        }
        else if((a>99)&&(a<1000)){
            System.out.println("it is three digit number");
        }
        else{
            System.out.println("it is negative or four digit number");
        }
    }
}