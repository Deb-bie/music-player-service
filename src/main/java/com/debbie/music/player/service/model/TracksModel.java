package com.debbie.music.player.service.model;


import lombok.Data;

import java.util.List;

@Data
public class TracksModel {
    private List<TracksData> data;
    private int total;
}
