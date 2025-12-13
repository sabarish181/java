import java.util.Scanner;
public class q24{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(3);
        if(ch>='0'&& ch<='9'){
            System.out.println("It is a digit");
        }
        else{
            System.out.println("It is not a digit");
        }
    }
}