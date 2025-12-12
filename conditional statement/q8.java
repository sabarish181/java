import java.util.Scanner;
public class q8{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a%10;
        if(b%3==0){
            System.out.println(b+"is divisible by 3");
        }
        else{
            System.out.println(b+"is not divisible by 3");
        }
    }
}

