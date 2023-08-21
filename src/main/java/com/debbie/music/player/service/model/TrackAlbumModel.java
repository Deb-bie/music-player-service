package com.debbie.music.player.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TrackAlbumModel {
    private long id;
    private String title;
    private String cover;
    @JsonProperty("cover_small")
    private String coverSmall;
    @JsonProperty("cover_medium")
    private String coverMedium;
    @JsonProperty("cover_big")
    private String coverBig;
    @JsonProperty("cover_xl")
    private String coverXl;
    @JsonProperty("md5_image")
    private String md5Image;
    @JsonProperty("tracklist")
    private String trackList;
    private String type;
}
