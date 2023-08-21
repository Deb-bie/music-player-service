package com.debbie.music.player.service.model;

import lombok.Data;

@Data
public class PlaylistUser {
    private long id;
    private String name;
    private String tracklist;
    private String user;
}
