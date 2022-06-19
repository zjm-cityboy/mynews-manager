package com.web.news.service;

import com.web.news.pojo.News;

public interface NewsEditService {

    public void updateNews(News news);

    public void addNews(News news);

    public void removeNews(int[] ids);

}