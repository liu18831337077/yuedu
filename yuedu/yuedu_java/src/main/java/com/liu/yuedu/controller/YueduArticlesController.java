package com.liu.yuedu.controller;

import com.github.pagehelper.PageInfo;
import com.liu.yuedu.pojo.YueduArticles;
import com.liu.yuedu.service.YueduArticlesService;
import com.liu.yuedu.vo.YueduArticlesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/articles")
public class YueduArticlesController {

    @Autowired
    YueduArticlesService yueduArticlesService;


    /**
     * 根据分类得到文章
     */
    @GetMapping("/getArticlesByCate")
    public Map<String, Object> getArticlesByCateAndPage(Integer art_cate,Integer page){
        Map<String, Object> resultMap= new HashMap<String, Object>();
        PageInfo<YueduArticles> articlePageByUserId = yueduArticlesService.getArticlesByCateAndPage(art_cate, page);
        resultMap.put("data",articlePageByUserId.getList());
        resultMap.put("isLastPage",articlePageByUserId.isIsLastPage());
        return resultMap;
    }
    /**
     * 删除文章
     */
    @PostMapping("/removeArt")
    public Map<String,Object> removeArt(Integer artId){
        Map<String, Object> resultMap= new HashMap<String, Object>();
        int resultNum=yueduArticlesService.removeArt(artId);
        resultMap.put("status","no");
        if(resultNum>0){
            resultMap.put("status","ok");
        }
        return resultMap;
    }
    /**
     * 添加文章
     * @param yueduArticles
     * @return
     */
    @PostMapping("/addArticle")
    public Map<String,Object> addArticle(@RequestBody YueduArticles yueduArticles){
        Map<String, Object> objectMap = yueduArticlesService.addArticle(yueduArticles);
        return objectMap;
    }

    /**
     * 分页得到指定用户的文章
     * @param uid
     * @param page
     * @return
     */
    @GetMapping("/getArticlePageByUserId")
    public Map<String,Object> getArticlePageByUserId(Integer uid,Integer page){
        Map<String, Object> resultMap= new HashMap<String, Object>();
        PageInfo<YueduArticles> articlePageByUserId = yueduArticlesService.getArticlePageByUserId(uid, page);
        resultMap.put("data",articlePageByUserId.getList());
        resultMap.put("isLastPage",articlePageByUserId.isIsLastPage());
        return resultMap;
    }

    /**
     * 分页得到所有文章
     * @param page
     * @return
     */
    @GetMapping("/getArticleAllPage")
    public Map<String,Object> getArticleAllPage(Integer page){
        Map<String, Object> resultMap= new HashMap<String, Object>();
        PageInfo<YueduArticles> articlePageByUserId = yueduArticlesService.getArticlePageByUserId(null, page);
        resultMap.put("data",articlePageByUserId.getList());
        resultMap.put("isLastPage ",articlePageByUserId.isIsLastPage());
        return resultMap;
    }

    /**
     * 修改文章
     * @param yueduArticles
     * @return
     */
    @PostMapping("/updateArticle")
    public Map<String,Object> updateArticle(@RequestBody YueduArticles yueduArticles){
        Map<String, Object> resultMap= new HashMap<String, Object>();
        System.out.println(yueduArticles.toString());
        int resultNum=yueduArticlesService.updateArticle(yueduArticles);
        if(resultNum>0){
            resultMap.put("msg","ok");
        }else{
            resultMap.put("msg","no");
        }
        return resultMap;
    }


    /**
     * 通过id得到视图文章对象
     * @return
     */
    @GetMapping("/getArticleById")
    public YueduArticlesVo getArticleById(Integer id){
        return yueduArticlesService.getArticleById(id);
    }

}
