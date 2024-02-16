package BankingSystem;

import java.util.ArrayList;

class Bank{
    private String name;
    private String location;
    private ArrayList<Account> accounts;

    public Bank(String name, String location) {
        this.name = name;
        this.location = location;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public String getBankDetails() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    public void addAccount(Account account){
        accounts.add(account);
//        return "Account "+ account +" has been added";
    }
}
class Account{
    private Customer accountOwner;
    private String accountNumber;
    private double balance;

    public String getAccountDetails() {
        return "Account{" +
                "accountOwner=" + accountOwner +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Account(Customer accountOwner, String accountNumber, double balance) {
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Customer getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(Customer accountOwner) {
        this.accountOwner = accountOwner;
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
    public String deposit(double amount){
        balance += amount;
        return "An amount of " + amount + " has been deposited to Acc No. " + accountNumber + ".";
    }
    public String withdraw(double amount){
        if (amount > balance){
            return "Insufficient balance";
        }else{
            balance -= amount;
            return "Amount of " + amount + " has been withdrawn from Acc No. " + accountNumber + ". Updated balance is " + balance + ".";
        }
    }
}
class Customer{
    private String name;
    private String address;
    private String contact;
    private ArrayList<Account> accounts;

    public Customer(String name, String address, String contact) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.accounts = new ArrayList<>();
    }

    public String getCustomerDetails() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Account accounts) {
        this.accounts.add(accounts);
    }
    public String openAccount(Account account){
        if (this.accounts.contains(account)){
            return "Account already there";
        }
        accounts.add(account);
        return "Opened a new Account " + account + ".";
    }
    public String closeAccount(Account account){
        accounts.remove(account);
        return "Closed an Account " + account + ".";
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI","Pune");
        Customer customer1 = new Customer("Monson","Wadgaon Sheri, Pune","9404505768");
        Customer customer2 = new Customer("Piyush","Ambedkar Nagar, Nanded","8457868439");
        Account account1 = new Account(customer1, "123456789",25000);
        Account account2 = new Account(customer1, "987654321",2000);
        Account account3 = new Account(customer2,"5656565656",20000);

        System.out.println(bank.getBankDetails());
        System.out.println(customer1.getCustomerDetails());
        System.out.println(customer2.getCustomerDetails());
        System.out.println(account1.getAccountDetails());
        System.out.println(account2.getAccountDetails());
        System.out.println(account3.getAccountDetails());

        System.out.println(customer1.openAccount(account1));
        System.out.println(customer1.openAccount(account2));

        System.out.println(account1.deposit(3400));
        System.out.println(account2.withdraw(23000));
    }
}
