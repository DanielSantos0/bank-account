import java.util.Scanner;

public class TerminalAccount {

    public static void main(String[] args) {

        int accountNumber;
        int agency;
        String name;
        double balance;

        Scanner infos = new Scanner(System.in);
        System.out.println("Type the number of your account");

        accountNumber = infos.nextInt();

        System.out.println("Type the number of your agency");
        agency = infos.nextInt();

        System.out.println("Type your name");
        name = infos.next();

        System.out.println("Type your balance");
        balance = infos.nextDouble();

        System.out.println("Hello " + name + " thank you for create your account with us, your agency is " + agency + " and your balance " + balance + " is ready for withdraw  " );



    }
}
