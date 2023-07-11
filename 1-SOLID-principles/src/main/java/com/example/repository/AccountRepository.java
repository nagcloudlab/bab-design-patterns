package com.example.repository;

import com.example.model.*;

public interface AccountRepository {
    Account loadAccount(String number); // abstract-method
    Account updateAccount(Account account);
}
