import java.time.LocalDate;
//properties are private and methods are publiv
public class BankAccount {

    //maybe add private here
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String accountNumber;
    private double balance;
    private double interestRate;

    //Constructor
    //these are parameters
    public BankAccount(String inputFirstName, String inputLastName, LocalDate dateOfBirth, String inputAccountNumber, double interestRate) {
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = 0.0;
        this.interestRate = interestRate;

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

    public double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }


//method to deposit
    public void deposit(double amount) {
        balance += amount;
    }

//method to withdraw
    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance.");

        }
    }

//method to pay interest
    public void payInterest() {
        balance+= balance * interestRate;
    }

}

