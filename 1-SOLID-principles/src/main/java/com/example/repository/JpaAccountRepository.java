package com.example.repository;

import com.example.model.*;

public class JpaAccountRepository implements AccountRepository{

    public JpaAccountRepository(){
        System.out.println("JPAAccountRepository component created");
    }

    public Account loadAccount(String number) {
        System.out.println("loading account "+number);
        //TODO
        return new Account(number, 1000.00);
    }

    public Account updateAccount(Account account) {
        System.out.println("updating account "+account.getNumber());
        //TODO
        return account;
    }

}
