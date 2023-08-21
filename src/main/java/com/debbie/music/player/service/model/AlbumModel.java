package com.debbie.music.player.service.model;

import lombok.Data;

import java.util.List;

@Data
public class AlbumModel {
    private List<AlbumData> data;
    private int total;
}
