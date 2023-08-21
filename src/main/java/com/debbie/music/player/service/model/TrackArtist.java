package com.debbie.music.player.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TrackArtist {
    private long id;
    private String name;
    private String link;
    private String picture;
    @JsonProperty("picture_small")
    private String pictureSmall;
    @JsonProperty("picture_medium")
    private String pictureMedium;
    @JsonProperty("picture_big")
    private String pictureBig;
    @JsonProperty("picture_xl")
    private String pictureXl;
    private Boolean radio;
    @JsonProperty("tracklist")
    private String trackList;
    private String type;
}
