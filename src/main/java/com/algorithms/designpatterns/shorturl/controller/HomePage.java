package com.algorithms.designpatterns.shorturl.controller;


import com.algorithms.designpatterns.shorturl.model.UrlRequestBody;
import com.algorithms.designpatterns.shorturl.model.UrlResponseBody;
import com.algorithms.designpatterns.shorturl.service.ShortUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomePage {

    @Autowired
    private ShortUrlService shortUrlService;

    @GetMapping
    public String homePage(){
        return "Application is running.";
    }

    @PostMapping("/shorten")
    public UrlResponseBody getShortUrl(@RequestBody UrlRequestBody requestBody) {
        return shortUrlService.getShortUrl(requestBody);
    }
}
