import java.util.Scanner;

public class q3 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        Integer i1=sc.nextInt();    
        System.out.println("enter second number:");
        Integer i2=sc.nextInt();    
        System.out.println("sum of two number is:"+(i1+i2));
        sc.close();
    }
}
