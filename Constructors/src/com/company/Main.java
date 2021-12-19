package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        BankAccount bobsAcccount = new BankAccount("12345",0.00,"Bob Brown", "myEmail@email.com", "7323374585");
//        bobsAcccount.getAccountNum();
//        bobsAcccount.getBalance();
//        bobsAcccount.withdrawFunds(100.00);
//
//        bobsAcccount.depositFunds(50.0);
//        bobsAcccount.withdrawFunds(100.0);
//
//        bobsAcccount.depositFunds(51.0);
//        bobsAcccount.withdrawFunds(100.0);
        VipCustomer noahVip = new VipCustomer();
        System.out.println(noahVip.getName());
        System.out.println(noahVip.getCreditLimit());
        System.out.println(noahVip.getEmail());

        VipCustomer noahVip2 = new VipCustomer("Bob", "bob@mail.com");
        System.out.println(noahVip2.getName());
        System.out.println(noahVip2.getCreditLimit());
        System.out.println(noahVip2.getEmail());

        VipCustomer noahVip3 = new VipCustomer("Bob",50000, "bob@mail.com");
        System.out.println(noahVip3.getName());
        System.out.println(noahVip3.getCreditLimit());
        System.out.println(noahVip3.getEmail());
    }



}
