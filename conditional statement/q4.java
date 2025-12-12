import java.util.Scanner;
public class q4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a%2==0&&b%2==0){
            System.out.println("both is an even");
        }
        else if(a%2==0){
            System.out.println(a+" is even\n"+b+" is odd");
        }
        else if(b%2==0){
            System.out.println(b+" is even\n"+a+" is odd");
        }
        else{
            System.out.println("both are odd");
        }
    }
}