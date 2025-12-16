import java.util.Scanner;
public class q3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int pro=1;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            pro*=i;
        }
        System.out.println(pro);
    }
}