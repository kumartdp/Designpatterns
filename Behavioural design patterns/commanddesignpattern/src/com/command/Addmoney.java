package com.command;

public class Addmoney implements Transact{

    private AccountHolder accountholder;
    int amount;

    public Addmoney(AccountHolder accountholder,int amount){
        this.accountholder=accountholder;
        this.amount=amount;
    }

    public void execute() {
        accountholder.addAmount(amount);
    }

}
