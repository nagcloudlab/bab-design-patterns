package com.example;

import com.example.factory.*;
import com.example.repository.*;
import com.example.service.*;

public class Application {
    public static void main(String[] args) {

        //--------------------------------------------------------------------
        // initializing/booting phase
        //--------------------------------------------------------------------
        System.out.println("-".repeat(100));

        AccountRepository jdbcAccountRepository = AccountRepositoryFactory.getAccountRepository("jdbc");
        AccountRepository jpaAccountRepository = AccountRepositoryFactory.getAccountRepository("jpa");

        UPTransferService transferService = new UPTransferService(jpaAccountRepository);

        System.out.println("-".repeat(100));
        //--------------------------------------------------------------------
        // use phase
        //--------------------------------------------------------------------

        transferService.transfer("111", "222", 100.00);
        System.out.println();
        transferService.transfer("111", "222", 100.00);


        //--------------------------------------------------------------------
        // destroy/cleaning phase
        //--------------------------------------------------------------------
        System.out.println("-".repeat(100));
        transferService = null;
        System.out.println("-".repeat(100));

    }
}
