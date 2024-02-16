package org.example;

import java.util.ArrayList;

public class Bank {
    private ArrayList<org.example.Account> accounts;

    public Bank() {
        accounts = new ArrayList <org.example.Account> ();
    }

    public void addAccount(org.example.Account account) {
        accounts.add(account);
    }

    public void removeAccount(org.example.Account account) {
        accounts.remove(account);
    }

    public void depositMoney(org.example.Account account, double amount) {
        account.deposit(amount);
    }

    public void withdrawMoney(org.example.Account account, double amount) {
        account.withdraw(amount);
    }

    public ArrayList <org.example.Account> getAccounts() {
        return accounts;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        org.example.Account account1 = new org.example.Account("Peter Irmgard", "C0011", 5000);
        org.example.Account account2 = new org.example.Account("Katja Ruedi", "C0121", 4500);
        org.example.Account account3 = new org.example.Account("Marcella Gebhard", "C0222", 20000);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        ArrayList <org.example.Account> accounts = bank.getAccounts();

        for (org.example.Account account: accounts) {
            System.out.println(account.getAccountInfo());
        }

        System.out.println("\nAfter depositing 1000 into account1:");
        bank.depositMoney(account1, 1000);
        System.out.println(account1.getAccountInfo());
        System.out.println("No transaction in account2:");
        System.out.println(account2.getAccountInfo());
        System.out.println("After withdrawing 5000 from account3:");
        bank.withdrawMoney(account3, 5000);
        System.out.println(account3.getAccountInfo());
    }
}
