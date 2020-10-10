package ir.maktab39.repositories.impl;

import ir.maktab39.Session;
import ir.maktab39.base.repository.BaseRepositoryImpl;
import ir.maktab39.entities.Account;
import ir.maktab39.repositories.AccountRepo;

import javax.persistence.EntityManager;

public class AccountRepoImpl extends BaseRepositoryImpl<Long, Account>
        implements AccountRepo {
    @Override
    public Class<Account> getEntityClass() {
        return Account.class;
    }

    @Override
    protected EntityManager getEntityManager() {
        return Session.getEntityManager();
    }

}