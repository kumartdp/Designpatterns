package com.command;
import com.command.AccountHolder;
import com.command.Transact;

import java.util.ArrayList;
import java.util.List;

public class Transactionimpl {



    private List<Transact>  transactions= new ArrayList<Transact>();

    public void maketransaction(Transact transaction){
        transactions.add(transaction);
    }

    public void performTransactions(){

        for (Transact t: transactions) {
            t.execute();
        }
        transactions.clear();
    }
}
