package com.web.news.service;

import com.web.news.pojo.Category;
import com.web.news.pojo.News;

import java.util.List;

public interface NewsQueryService {

    public List<News> findAllNews();

    public List<News> findNewsByCondition(News news);

    public News findNewsById(Integer id);

    public List<Category> findAllCategory();
}
