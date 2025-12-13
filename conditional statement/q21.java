import java.util.Scanner;
public class q21{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='A'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            System.out.println("It is vowels");
        }
        else{
            System.out.println("It is consonant");
        }
    }
}