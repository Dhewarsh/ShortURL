package com.algorithms.designpatterns.shorturl.repo;

import com.algorithms.designpatterns.shorturl.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepo extends JpaRepository<Url, Long>{
    String findByShortUrl(String shortUrl);
}
