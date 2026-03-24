package com.algorithms.designpatterns.shorturl.utils;

import java.util.Map;

public class UrlConstants {
    private UrlConstants() {}

    public static String BASE_URL = "aaaaaaaa";

    public static final Map<Long, Character> HEXA_VALUES = Map.of(
            10L, 'a',
            11L, 'b',
            12L, 'c',
            13L, 'd',
            14L, 'e',
            15L, 'f'
    );
}