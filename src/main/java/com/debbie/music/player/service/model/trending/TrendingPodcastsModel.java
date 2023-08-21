package com.debbie.music.player.service.model.trending;

import com.debbie.music.player.service.model.trending.TrendingPodcastsData;
import lombok.Data;

import java.util.List;

@Data
public class TrendingPodcastsModel {
    private List<TrendingPodcastsData> data;
    private int total;
}
