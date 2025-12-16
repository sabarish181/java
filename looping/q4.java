import java.util.Scanner;
public class q4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        if(n==0){
            System.out.println("1");
        }
        else{
        while(n>0){
            count++;
            n/=10;
        }
        System.out.println(count);
    }
    }
}