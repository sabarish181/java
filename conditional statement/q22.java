import java.util.Scanner;
public class q22{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("it is upper");
        }
        else if(ch>='a'&&ch<='z'){
            System.out.println("it is lower");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("it is digit");
        }
        else{
            System.out.println("it is special symbol");
        }
        
    }
}