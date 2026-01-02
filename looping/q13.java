//perfect square
import java.util.Scanner;

public class q13 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int i;
        for (i = 0; i * i <= n; i++) 
        {
            if (i * i == n) 
            {
                System.out.println(n + " is a perfect square.");
                break; 
            }
        }
        
        if (i * i > n) 
            { 
            System.out.println(n + " is not a perfect square.");
            }
    }
}
