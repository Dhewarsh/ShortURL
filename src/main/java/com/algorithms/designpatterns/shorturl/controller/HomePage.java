package com.algorithms.designpatterns.shorturl.controller;


import com.algorithms.designpatterns.shorturl.model.UrlRequestBody;
import com.algorithms.designpatterns.shorturl.model.UrlResponseBody;
import com.algorithms.designpatterns.shorturl.service.ShortUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

    @Autowired
    private ShortUrlService shortUrlService;

    @PostMapping("/shorten")
    public UrlResponseBody getShortUrl(@RequestBody UrlRequestBody requestBody) {

        return shortUrlService.getShortUrl(requestBody);
    }
}
