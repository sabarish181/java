import java.util.Scanner;
public class q10{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int a=N%10;
        int b=N/100;
        System.out.println(b+" "+a);
    }
}