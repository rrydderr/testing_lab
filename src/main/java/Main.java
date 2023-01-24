import java.awt.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(
                "Ryder",
                "Zane",
                LocalDate.of(2001,01,05),
                "234567",
                0.05
        );
        bankAccount.deposit(55.00);
        bankAccount.withdrawal(33.00);


        System.out.println(bankAccount.getFirstName());
        System.out.println(bankAccount.getLastName());
        System.out.println(bankAccount.getDateOfBirth());
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());

        //deposit
        System.out.println("Balance after deposit: " + bankAccount.getBalance());

        //withdrawal
        System.out.println("Balance after withdrawal: " + bankAccount.getBalance());

        //interest rates
        System.out.println("Balance before interest: " + bankAccount.getBalance());

        bankAccount.payInterest();

        System.out.println("Balance after interest added: " + bankAccount.getBalance());



    }
}
