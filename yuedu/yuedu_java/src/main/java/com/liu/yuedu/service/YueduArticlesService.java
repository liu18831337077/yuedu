package com.liu.yuedu.service;

import com.github.pagehelper.PageInfo;
import com.liu.yuedu.pojo.YueduArticles;
import com.liu.yuedu.vo.YueduArticlesVo;

import java.util.Map;

/**
 * 文章
 */
public interface YueduArticlesService {

    /**
     * 添加文章
     * @param yueduArticles 文章对象
     * @return
     */
    Map<String,Object> addArticle(YueduArticles yueduArticles);

    /**
     * 根据用户id分页查询文章，如果用户id为空则全部查询
     */
    PageInfo<YueduArticles> getArticlePageByUserId(Integer uid, Integer page);

    /**
     * 删除文章
     * @param artId
     * @return
     */
    int removeArt(Integer artId);

    /**
     * 通过id得到文章对象
     * @param id
     * @return
     */
    YueduArticlesVo getArticleById(Integer id);

    /**
     * 修改文章
     */
    int updateArticle(YueduArticles yueduArticles);

    PageInfo<YueduArticles> getArticlesByCateAndPage(Integer art_cate, Integer page);
}
