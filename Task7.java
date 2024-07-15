import java.util.ArrayList;
import java.util.List;

public class Task7 {

    public class BankAccount {
        private String accountNumber;
        private double balance;


        public BankAccount(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
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

        // Method to deposit money
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited $" + amount + " into account " + accountNumber);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Method to withdraw money
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + " from account " + accountNumber);
            } else {
                System.out.println("Insufficient funds or invalid amount.");
            }
        }

        // Method to display account information
        public void displayAccountInfo() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }


    public class Customer {
        private String name;
        private String customerID;
        private List<BankAccount> bankAccounts;

        // Constructor
        public Customer(String name, String customerID) {
            this.name = name;
            this.customerID = customerID;
            this.bankAccounts = new ArrayList<>();
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter for customerID
        public String getCustomerID() {
            return customerID;
        }

        // Setter for customerID
        public void setCustomerID(String customerID) {
            this.customerID = customerID;
        }

        // Method to add a bank account
        public void addBankAccount(BankAccount account) {
            bankAccounts.add(account);
        }

        // Method to deposit money into a specific account
        public void deposit(String accountNumber, double amount) {
            for (BankAccount account : bankAccounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    account.deposit(amount);
                    return;
                }
            }
            System.out.println("Account not found.");
        }

        // Method to withdraw money from a specific account
        public void withdraw(String accountNumber, double amount) {
            for (BankAccount account : bankAccounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    account.withdraw(amount);
                    return;
                }
            }
            System.out.println("Account not found.");
        }

        // Method to display customer information
        public void displayCustomerInfo() {
            System.out.println("Customer Name: " + name);
            System.out.println("Customer ID: " + customerID);
            System.out.println("Bank Accounts:");
            for (BankAccount account : bankAccounts) {
                account.displayAccountInfo();
            }
        }
    }


}
