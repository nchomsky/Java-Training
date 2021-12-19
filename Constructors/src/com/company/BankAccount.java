package com.company;

public class BankAccount {
    private String accountNum;
    private double balance;
    private String custName;
    private String email;
    private String phoneNumber;

    //Can create multiple constructors that go back and call the main constructor (best practice). this is constructor overloading (similar to method overloading)
    public BankAccount(){
        this("56789",2.50, "Default Name", "Default Address", "Default Phone");
        System.out.println("empty constructor called");
    }

    public BankAccount(String accountNum, double balance, String custName, String email, String phoneNumber){
        this.accountNum = accountNum;
        this.balance = balance;
        this.custName = custName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double funds){
        if(funds < 0){
            System.out.println("Not a valid deposit number");
        } else {
            this.balance = this.balance + funds;
            System.out.println("Deposit of " + funds + " made. New balance: " + this.balance);

        }
    }

    public void withdrawFunds(double withdraw){
        if(withdraw < 0){
            System.out.println("Not a valid number");
        } else if(this.balance - withdraw < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance = this.balance - withdraw;
            System.out.println("Withdrawal of " + withdraw + " processed. Remaining balance: " + this.balance);
        }
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
