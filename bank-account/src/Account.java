public class Account {
  private int accountNumber;
  private String accountHolder;
  private double balance;

  public Account(int accountNumber, String accountHolder, double initialDeposit) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.deposit(initialDeposit);
  }

  public Account(int accountNumber, String accountHolder) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  public double getBalance() {
    return balance;
  }
  
  public void deposit(double value) {
    this.balance += value;
  }

  public void withdraw(double value) {
    this.balance -= value + 5;
  }

  @Override
  public String toString() {
    return "Account data:\nAccount " + this.getAccountNumber()
    + ", Holder: " + this.getAccountHolder() + ", Balance: $ " + this.getBalance();
  }

}