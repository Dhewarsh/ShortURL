package com.algorithms.designpatterns.shorturl.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UrlRequestBody {
    public Long id;
    public String url;
    public LocalDateTime duration;
}
