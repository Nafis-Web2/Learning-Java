package Bank_Account;
import Bank_Account.bank_account;

public class Main {
    public static void main(String[] args) {
        bank_account account1 = new bank_account();
        account1.accountNumber = 123456;
        account1.accountHolderName = "Nafis Hossain";
        account1.balance = 1000.0;

        System.out.println("Account Number: " + account1.accountNumber);
        System.out.println("Account Holder Name: " + account1.accountHolderName);
        System.out.println("Balance: $" + account1.balance);
    }
}
