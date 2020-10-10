package ir.maktab39.services.impl;

import ir.maktab39.base.service.BaseServiceImpl;
import ir.maktab39.entities.Post;
import ir.maktab39.repositories.PostRepo;
import ir.maktab39.repositories.impl.PostRepoImpl;
import ir.maktab39.services.PostService;

public class PostServiceImpl extends BaseServiceImpl<Long, Post, PostRepo>
        implements PostService {
    public PostServiceImpl() {
        super(PostRepoImpl.class);
    }

}