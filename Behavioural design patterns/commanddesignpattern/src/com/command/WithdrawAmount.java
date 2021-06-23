package com.command;

public class WithdrawAmount implements Transact{
    private AccountHolder accountholder;
    int amount;

    public WithdrawAmount(AccountHolder accountholder,int amount){
        this.accountholder=accountholder;
        this.amount=amount;
    }

    public void execute() {
        accountholder.withdrawamount(amount);
    }

}
