import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("hello world ");
       double balance = 4000;

       System.out.println("WELCOME TO THE SAM PAYMENT SYSTEM ");
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the amount to be paid");
       int amount = sc.nextInt();

    
       if (amount >=0 )
          if(amount>balance)
            System.out.println("insuffici payment");
          else if (amount==balance)
            System.out.println("payment successfull pr bhai account khali hogya vai");
       else
        System.out.println("invalid payment");
    }
}
