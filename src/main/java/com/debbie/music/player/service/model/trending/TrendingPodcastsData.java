package com.debbie.music.player.service.model.trending;

import lombok.Data;

@Data
public class TrendingPodcastsData {
    private long id;
    private String title;
    private String description;
    private Boolean available;
    private int fans;
    private String link;
    private String share;
    private String picture;
    private String picture_small;
    private String picture_medium;
    private String picture_big;
    private String picture_xl;
    private String type;
}
