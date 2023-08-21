package com.debbie.music.player.service.model.trending;

import com.debbie.music.player.service.model.PlaylistUser;
import lombok.Data;

@Data
public class TrendingPlaylistsData {
    private long id;
    private String title;
    private String nb_tracks;
    private String link;
    private String picture;
    private String picture_small;
    private String picture_medium;
    private String picture_big;
    private String picture_xl;
    private String checksum;
    private String tracklist;
    private String creation_date;
    private String md5_image;
    private String picture_type;
    private PlaylistUser user;
    private String type;
}
