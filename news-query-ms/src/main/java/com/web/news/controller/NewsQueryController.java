package com.web.news.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.netflix.discovery.converters.Auto;
import com.web.news.pojo.Category;
import com.web.news.pojo.News;
import com.web.news.service.NewsQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsQueryController {
    @Autowired
    private NewsQueryService newsQueryService;

    @GetMapping("/queryNews")
    public List<News> queryNews(){
        return newsQueryService.findAllNews();
    }

    @GetMapping("/findAllCategory")
    public List<Category> findAllCategory() {
        List<Category> list = newsQueryService.findAllCategory();
        return list;
    }

    @PostMapping("/queryNewsByCondition")
    public List<News> queryNewsByCondition(@RequestBody News news) {
        System.out.println(news.getCategoryid());
        System.out.println(news.getTitle());
        return newsQueryService.findNewsByCondition(news);
    }

    @GetMapping("/findNewsById/{id}")
    public News findNewsById(@PathVariable int id) {
        return newsQueryService.findNewsById(id);
    }

}
