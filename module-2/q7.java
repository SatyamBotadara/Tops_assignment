import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String:");
        String s=sc.nextLine();
        System.out.println("enter char");
        char c=sc.next().charAt(0);
        sc.close();
        Integer count=0;

        for(int i=0;i<s.length();i++)
        {
            if(c==s.charAt(i)){
                count++;
            }    
        }


        if(count==0)
        {
            System.out.println("character is not found in string");
        }
        else{
            System.out.println("character found "+count+" times");
        }
            

    }
}
