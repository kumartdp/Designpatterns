package com.command;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter account holder name");
        String name=sc.next();
        System.out.println("enter account holder balance");
        int bal=sc.nextInt();

        AccountHolder acc=new AccountHolder(name,bal);
        System.out.println("eneter amount ");
        int amount=sc.nextInt();

            Addmoney addmoney = new Addmoney(acc,amount);

        WithdrawAmount withdraw = new WithdrawAmount(acc,amount);
        Transactionimpl trans=new Transactionimpl();
        trans.maketransaction(addmoney);
        trans.maketransaction(withdraw);
        trans.performTransactions();



    }





}
