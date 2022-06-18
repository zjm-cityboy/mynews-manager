package com.web.news.service.impl;

import com.web.news.mapper.NewsMapper;
import com.web.news.pojo.News;
import com.web.news.service.NewsEditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class NewsEditServiceImpl implements NewsEditService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public void updateNews(News news) {
        news.setCreatedate(new Date());
        newsMapper.updateByPrimaryKey(news);
    }

    @Override
    public void addNews(News news) {
        news.setCreatedate(new Date());
        newsMapper.insert(news);
    }

}