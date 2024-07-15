import java.util.ArrayList;
import java.util.List;
public class Task6 {
    public static void main(String[] args) {
        // Create a customer
        Customer customer1 = new Customer("John Doe", 1);
        // Create bank accounts for the customer
        BankAccount account1 = new BankAccount(101, 1000);
        BankAccount account2 = new BankAccount(102, 500);
        customer1.addBankAccount(account1);
        customer1.addBankAccount(account2);
        customer1.displayCustomerInfo();
        customer1.depositMoney(101, 500);
        customer1.displayCustomerInfo();
        customer1.withdrawMoney(102, 200);
        customer1.displayCustomerInfo();
    }

    public static class Customer {
        private String name;
        private int customerID;
        private List<BankAccount> bankAccounts;

        public Customer(String name, int customerID) {
            this.name = name;
            this.customerID = customerID;
            this.bankAccounts = new ArrayList<>();
        }

        // Getter and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCustomerID() {
            return customerID;
        }

        public void setCustomerID(int customerID) {
            this.customerID = customerID;
        }

        // Method to add a bank account
        public void addBankAccount(BankAccount account) {
            bankAccounts.add(account);
        }

        // Method to display customer information
        public void displayCustomerInfo() {
            System.out.println("Customer ID: " + customerID);
            System.out.println("Name: " + name);
            System.out.println("Bank Accounts:");
            for (BankAccount account : bankAccounts) {
                account.displayAccountInfo();
            }
            System.out.println();
        }

        public void depositMoney(int accountNumber, double amount) {
            for (BankAccount account : bankAccounts) {
                if (account.getAccountNumber() == accountNumber) {
                    account.deposit(amount);
                    System.out.println("Successfully deposited $" + amount + " into account " + accountNumber);
                    return;
                }
            }
            System.out.println("Account " + accountNumber + " not found.");
        }

        public void withdrawMoney(int accountNumber, double amount) {
            for (BankAccount account : bankAccounts) {
                if (account.getAccountNumber() == accountNumber) {
                    if (account.getBalance() >= amount) {
                        account.withdraw(amount);
                        System.out.println("Successfully withdrew $" + amount + " from account " + accountNumber);
                    } else {
                        System.out.println("Insufficient balance in account " + accountNumber);
                    }
                    return;
                }
            }
            System.out.println("Account " + accountNumber + " not found.");
        }
    }

    public static class BankAccount {
        private int accountNumber;
        private double balance;

        public BankAccount(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            balance -= amount;
        }

        public void displayAccountInfo() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }

}
