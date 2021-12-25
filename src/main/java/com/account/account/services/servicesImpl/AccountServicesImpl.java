package com.account.account.services.servicesImpl;

import com.account.account.dao.AccountMapper;
import com.account.account.model.Account;
import com.account.account.services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServicesImpl implements AccountServices {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> getAccountList() {
        return accountMapper.getAccountList();
    }

    @Override
    public int addAccount(Account account) {
        return accountMapper.addAccount(account);
    }
}
