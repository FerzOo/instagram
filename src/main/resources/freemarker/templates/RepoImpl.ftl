package ir.maktab39.repositories.impl;

import ir.maktab39.Session;
import ir.maktab39.base.repository.BaseRepositoryImpl;
import ir.maktab39.entities.${entityName};
import ir.maktab39.repositories.${entityName}Repo;

import javax.persistence.EntityManager;

public class ${entityName}RepoImpl extends BaseRepositoryImpl<Long, ${entityName}>
        implements ${entityName}Repo {

    @Override
    public Class<${entityName}> getEntityClass() {
        return ${entityName}.class;
    }

    @Override
    protected EntityManager getEntityManager() {
        return Session.getEntityManager();
    }

}