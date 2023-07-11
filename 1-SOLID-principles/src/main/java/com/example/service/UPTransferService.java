package com.example.service;

import com.example.factory.*;
import com.example.model.*;
import com.example.repository.*;

public class UPTransferService {

    private AccountRepository accountRepository;

    public UPTransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
        System.out.println("UPTransferService component created");
    }

    public void transfer(String from, String to, double amount) {
        System.out.println("transfer initiated");
//        JdbcAccountRepository accountRepository=new JdbcAccountRepository(); // don't create
//        AccountRepository accountRepository = AccountRepositoryFactory.getAccountRepository("jdbc"); // don't lookup

        // load 'from' & ''to' accounts
        Account fromAccount = accountRepository.loadAccount(from);
        Account toAccount = accountRepository.loadAccount(to);

        // transfer amount from 'from' to 'to'
        System.out.println("debit & credit");
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);

        // update both accounts
        accountRepository.updateAccount(fromAccount);
        accountRepository.updateAccount(toAccount);
        System.out.println("transfer completed");
    }

}
