import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("%nEnter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.nextLine().charAt(0);

        Account a1;
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            a1 = new Account(accountNumber, accountHolder, initialDeposit);
        } else {
            a1 = new Account(accountNumber, accountHolder);
        }

        System.out.println(a1.toString());
        System.out.print("Enter a deposit value: ");
        a1.deposit(sc.nextDouble());
        System.out.println(a1.toString());
        System.out.print("Enter a withdraw value: ");
        a1.withdraw(sc.nextDouble());
        System.out.println(a1.toString());

        sc.close();
        }
}