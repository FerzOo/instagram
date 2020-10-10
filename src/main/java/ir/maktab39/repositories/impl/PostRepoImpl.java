package ir.maktab39.repositories.impl;

import ir.maktab39.Session;
import ir.maktab39.base.repository.BaseRepositoryImpl;
import ir.maktab39.entities.Post;
import ir.maktab39.repositories.PostRepo;

import javax.persistence.EntityManager;

public class PostRepoImpl extends BaseRepositoryImpl<Long, Post>
        implements PostRepo {
    @Override
    public Class<Post> getEntityClass() {
        return Post.class;
    }

    @Override
    protected EntityManager getEntityManager() {
        return Session.getEntityManager();
    }

}