package com.account.account.dao;

import com.account.account.model.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountMapper {
    List<Account> getAccountList();

    int addAccount(Account account);
    int delAccount(String id);
}
