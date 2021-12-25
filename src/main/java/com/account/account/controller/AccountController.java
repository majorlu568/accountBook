package com.account.account.controller;

import com.account.account.common.Consts;
import com.account.account.common.Result;
import com.account.account.model.Account;
import com.account.account.services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/account")
public class AccountController {

    @Autowired
    private AccountServices accountServices;

    @GetMapping("/getAccountList")
    public Result getAccountList(){
        List<Account> accounts  = accountServices.getAccountList();
        return new Result(Consts.SUCCESS, Consts.SUCCESS, accounts);
    }

    @PostMapping("/addAccount")
    public Result addAccount(Account account){
        int addAccount = accountServices.addAccount(account);
        return new Result(Consts.SUCCESS, Consts.SUCCESS, addAccount);
    }

}
