package com.algorithms.designpatterns.shorturl.model;

import lombok.Data;

@Data
public class UrlRequestBody {
    public Long id;
    public String url;
    public String duration;
}
