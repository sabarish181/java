import java.util.Scanner;
public class q6{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        if(n!=rev){
            System.out.println("It is not palindrome");
        }else{
            System.out.println("It is a palindrome");
        }
    }
}