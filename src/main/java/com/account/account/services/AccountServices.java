package com.account.account.services;

import com.account.account.model.Account;

import java.util.List;

public interface AccountServices {
    List<Account> getAccountList();

    int addAccount(Account account);
}
