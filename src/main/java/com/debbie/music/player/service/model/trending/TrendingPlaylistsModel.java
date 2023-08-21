package com.debbie.music.player.service.model.trending;

import com.debbie.music.player.service.model.trending.TrendingPlaylistsData;
import lombok.Data;

import java.util.List;

@Data
public class TrendingPlaylistsModel {
    private List<TrendingPlaylistsData> data;
    private int total;
}
