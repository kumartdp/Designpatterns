package com.command;

public class AccountHolder {
    private String name;
    private int available_balance;
;

    public AccountHolder(String name, int available_balance) {
        this.name = name;
        this.available_balance = available_balance;

    }
    public void addAmount(int amount)
    {
        System.out.println("amount added");
        available_balance+=amount;
        System.out.println("available balance "+available_balance);
    }
    public void withdrawamount(int amount)
    {
        System.out.println("amount withdraw:"+amount);
        available_balance-=amount;
        System.out.println("available balance "+available_balance);
    }
}
