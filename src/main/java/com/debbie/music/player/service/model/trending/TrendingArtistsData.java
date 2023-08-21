package com.debbie.music.player.service.model.trending;


import lombok.Data;

@Data
public class TrendingArtistsData {
    private long id;
    private String name;
    private String link;
    private String picture;
    private String picture_small;
    private String picture_medium;
    private String picture_big;
    private String picture_xl;
    private Boolean radio;
    private String tracklist;
    private int position;
    private String type;
}
