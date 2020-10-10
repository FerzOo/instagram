package ir.maktab39.services.impl;

import ir.maktab39.base.service.BaseServiceImpl;
import ir.maktab39.entities.${entityName};
import ir.maktab39.repositories.${entityName}Repo;
import ir.maktab39.repositories.impl.${entityName}RepoImpl;
import ir.maktab39.services.${entityName}Service;

public class ${entityName}ServiceImpl extends BaseServiceImpl<Long, ${entityName}, ${entityName}Repo>
        implements ${entityName}Service {

    public ${entityName}ServiceImpl() {
        super(${entityName}RepoImpl.class);
    }

}