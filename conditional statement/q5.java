import java.util.Scanner;
public class q5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>99&&a<1000){
            System.out.println("It is a 3 digit number");
        }
        else{
            System.out.println("It is not a 3 digit number");
        }
    }
}