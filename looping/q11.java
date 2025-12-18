import java.util.Scanner;
public class q11{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=1;
        for(int i=1;i<=a;i++){
            if(num%i==0){
            count++;
        }
    }
       if(a%i==0){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}