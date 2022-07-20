import java.util.Scanner;

public class q5 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        Integer dividend=sc.nextInt();
        System.out.println("enter number:");
        Integer divisor=sc.nextInt();
        System.out.println("Quotient:"+(dividend/divisor));
        System.out.println("Remainder:"+(dividend%divisor));
        sc.close();

    }
}
