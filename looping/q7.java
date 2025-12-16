import java.util.Scanner;
public class q7{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int sum=0;
            int t=n;
            while(n!=0){
                int r=n%10;
                sum+=r*r*r;
                n=n/10;
            }
            if(sum==t){
                System.out.println("armstrong number");
            }
            else{
                System.out.println("Not an armstrong numner");
            }
    }
}