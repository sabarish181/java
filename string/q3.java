import java.util.Scanner;
public class q3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i] != str){
                System.out.println("palindrom");
            }
        }
        
    }
}