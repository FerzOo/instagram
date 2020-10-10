package ir.maktab39.services.impl;

import ir.maktab39.base.service.BaseServiceImpl;
import ir.maktab39.entities.Account;
import ir.maktab39.repositories.AccountRepo;
import ir.maktab39.repositories.impl.AccountRepoImpl;
import ir.maktab39.services.AccountService;

public class AccountServiceImpl extends BaseServiceImpl<Long, Account, AccountRepo>
        implements AccountService {
    public AccountServiceImpl() {
        super(AccountRepoImpl.class);
    }

}