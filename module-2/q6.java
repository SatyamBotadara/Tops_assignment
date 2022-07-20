import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        Integer i=sc.nextInt();
        sc.close();

        if(i%2==0)
        {
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
}

