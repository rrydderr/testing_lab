import java.time.LocalDate;
//properties are private and methods are publiv
public class BankAccount {

    //maybe add private here
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String accountNumber;
    private double balance;

    //Constructor
    //these are parameters
    public BankAccount(String inputFirstName, String inputLastName, LocalDate dateOfBirth, String inputAccountNumber) {
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = 0;

    }

    //getters and setters for each field
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth() {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


//method to deposit
    public void deposit(double amount) {
        balance += amount;
    }

//method to withdraw


}



//    public void deposit(double amount) {
//    balance += amount;
//    }
//
//
//    public void withdraw(double amount) {
//    if (amount > balance) {
//        System.out.println("Insufficient Funds!");
//    } else{
//        balance -= amount;
//        }


