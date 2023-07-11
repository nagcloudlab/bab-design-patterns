package com.example.factory;

import com.example.repository.*;

// Factory-Class
public class AccountRepositoryFactory {

    // Factory-Method
    public static AccountRepository getAccountRepository(String dataAccessTech) {
        if (dataAccessTech.equals("jdbc")) {
            return new JdbcAccountRepository();
        }
        if (dataAccessTech.equals("jpa")) {
            return new JpaAccountRepository();
        }
        throw new IllegalArgumentException("Invalid dataAccessTech");
    }

}
