package com.yun.oj.user.service;
import com.baomidou.mybatisplus.extension.service.IService;
import yun.oj.model.model.entity.PostThumb;
import yun.oj.model.model.entity.User;

/**
 * 帖子点赞服务
 *

 */
public interface PostThumbService extends IService<PostThumb> {

    /**
     * 点赞
     *
     * @param postId
     * @param loginUser
     * @return
     */
    int doPostThumb(long postId, User loginUser);

    /**
     * 帖子点赞（内部服务）
     *
     * @param userId
     * @param postId
     * @return
     */
    int doPostThumbInner(long userId, long postId);
}
