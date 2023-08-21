package com.debbie.music.player.service.model;

import lombok.Data;

@Data
public class AlbumData {
    private long id;
    private String link;
    private String cover;
    private String cover_small;
    private String cover_medium;
    private String cover_big;
    private String cover_xl;
    private String md5_image;
    private String record_type;
    private String tracklist;
    private Boolean explicit_lyrics;
    private int position;
    private TrackArtist artist;
    private String type;
}
