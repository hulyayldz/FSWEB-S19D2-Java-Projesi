package com.workintech.sp19d2.service;

import com.workintech.sp19d2.entity.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    Account save(Account account);
}
