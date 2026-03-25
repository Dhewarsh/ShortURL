package com.algorithms.designpatterns.shorturl.service;

import com.algorithms.designpatterns.shorturl.model.UrlRequestBody;
import com.algorithms.designpatterns.shorturl.model.UrlResponseBody;

public interface ShortUrlService {
    UrlResponseBody getShortUrl(UrlRequestBody requestBody);

    void redirectUrl(String url);
}
