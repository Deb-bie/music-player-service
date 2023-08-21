package com.debbie.music.player.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TracksData {
    private long id;
    private String title;
    @JsonProperty("title_short")
    private String titleShort;
    @JsonProperty("title_version")
    private String titleVersion;
    private int duration;
    private long rank;
    @JsonProperty("explicit_lyrics")
    private Boolean explicitLyrics;
    @JsonProperty("explicit_content_lyrics")
    private int explicitContentLyrics;
    @JsonProperty("explicit_content_cover")
    private int explicitContentCover;
    private String preview;
    @JsonProperty("md5_image")
    private String md5Image;
    private int position;
    private TrackArtist artist;
    private TrackAlbumModel album;
    private String type;
}
