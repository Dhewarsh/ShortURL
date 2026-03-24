package com.algorithms.designpatterns.shorturl.service.impl;

import com.algorithms.designpatterns.shorturl.model.UrlRequestBody;
import com.algorithms.designpatterns.shorturl.model.UrlResponseBody;
import com.algorithms.designpatterns.shorturl.model.Url;
import com.algorithms.designpatterns.shorturl.repo.UrlRepo;
import com.algorithms.designpatterns.shorturl.service.ShortUrlService;
import com.algorithms.designpatterns.shorturl.utils.UrlTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ShortUrlImpl implements ShortUrlService {
    @Autowired
    private UrlRepo urlRepo;

    @Override
    public UrlResponseBody getShortUrl(UrlRequestBody requestBody) {
        String shortUrl = UrlTool.getShortUrl(requestBody.getUrl());
        
        Url url = new Url();
        url.setOrgUrl(requestBody.getUrl());
        url.setShortUrl(shortUrl);
        url.setCreatedUrl(LocalDateTime.now());
        url.setDuration(requestBody.getDuration());
        
        url = urlRepo.save(url);
        
        UrlResponseBody response = new UrlResponseBody();
        response.setId(url.getId());
        response.setShortUrl(shortUrl);
        
        return response;
    }
}
