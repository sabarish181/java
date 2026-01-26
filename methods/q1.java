/* A method is a subprogram which used in a main program
we can develop methods in 4 ways
   with return type with arguments
   with return type without arguments
   without return type with arguments
   without return type without arguments


main advantage is code reusuability

when we are using methods we need to remember three things
  method declaration
  method definition
  method calling

implementation  -  with return type with arguments

    //declaration
    return_type method_name(datatype argument 1,.....,datatype argument_n)
    {
        statement - block;  //definition
    }
    //call the method in print statement if it having returntype
    method_name(datatype argument 1,....,datatype argument n); //calling

    //program
    import java.util.Scanner;
    public class Main
    {
        static int factorial(int n)
        {
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            return fact;
        }
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            Main m=new Main();
            System.out.println(factorial(5));
        }
    }




implementation  -  with return type without arguments

    //declaration
    return_type method_name()
    {
        statement - block;  //definition
    }
    //call the method in print statement if it having returntype
    method_name(); //calling

    //program
    import java.util.Scanner;
    public class Main
    {
       static int factorial()
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            return fact;
        }
        public static void main(String[]args)
        {
            System.out.println(factorial());
        }
    }





implementation  -  without return type with arguments

    //declaration
    void method_name(datatype argument 1,.....,datatype argument_n)
    {
        statement - block;  //definition
    }
    //we can directly call the method
    method_name(datatype argument 1,....,datatype argument n); //calling

    //program 
    import java.util.Scanner;
    public class Main
    {
        static void factorial(int n)
        {
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.println(fact);
        }
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            factorial(n);
        }
    }
implementation  -  without return type without arguments

    //declaration
    void method_name()
    {
        statement - block;  //definition
    }
    //we can directly call the method
    method_name(); //calling

    //program
    import java.util.Scanner;
    public class Main
    {
       static void factorial()
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.println(fact);
        }
        public static void main(String[]args)
        {
            factorial();
        }
    } */ 
    import java.util.Scanner;
    public class q1{
    static void insertionSort(int[]arr){
        int n = arr.length;
        for (int i=1;i<n;i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    static void printArray(int[]arr){
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {9,5,1,4,3};
        System.out.println("before sorting :");
        printArray(arr);
        insertionSort(arr);
        System.out.println("After sorting :");
        printArray(arr);
    }
}