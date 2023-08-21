package com.debbie.music.player.service.model.trending;

import com.debbie.music.player.service.model.trending.TrendingArtistsData;
import lombok.Data;

import java.util.List;

@Data
public class TrendingArtistsModel {
    private List<TrendingArtistsData> data;
    private int total;
    private String next;
}
