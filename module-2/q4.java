import java.util.Scanner;

public class q4 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);    
        System.out.println("enter first number:");
        Float f1=sc.nextFloat();
        System.out.println("enter second number:");
        Float f2=sc.nextFloat();
        System.out.println("multiplication of two number:"+(f1*f2));
        System.out.println("enter character:");
        Character c=sc.next().charAt(0);
        sc.close();
        int ascii =(int)c;
        System.out.println("ascii value:"+ascii);

    }
}
