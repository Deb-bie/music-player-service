package com.debbie.music.player.service.service;

import com.debbie.music.player.service.config.WebClientConfiguration;
import com.debbie.music.player.service.model.AlbumModel;
import com.debbie.music.player.service.model.TracksModel;
import com.debbie.music.player.service.model.trending.TrendingArtistsModel;
import com.debbie.music.player.service.model.trending.TrendingPlaylistsModel;
import com.debbie.music.player.service.model.trending.TrendingPodcastsModel;
import com.debbie.music.player.service.redis.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class MusicPlayerService {

    private final WebClientConfiguration webClient;
    private final RedisService redisService;

    @Value("${spring.redis.cache}")
    private String cacheName;

    @Value("${spring.redis.timeout}")
    private long timeout;

    @Value("${trending.tracks.uri}")
    private String trendingTracks;

    @Value("${trending.albums.uri}")
    private String trendingAlbum;

    @Value("${trending.artists.uri}")
    private String trendingArtists;

    @Value("${trending.playlists.uri}")
    private String trendingPlayList;

    @Value("${trending.podcasts.uri}")
    private String trendingPodcasts;


    public MusicPlayerService(WebClientConfiguration webClient,
                              RedisService redisService) {
        this.webClient = webClient;
        this.redisService = redisService;
    }

    public Flux<TracksModel> getTrendingTracks(){
        if (redisService.hasKey(cacheName) == null) {
            return redisService.get(cacheName);
        }
        Flux<TracksModel> res = webClient
                    .client()
                    .get()
                    .uri(trendingTracks)
                    .retrieve()
                    .bodyToFlux(TracksModel.class);
        redisService.set(cacheName, res, timeout, TimeUnit.SECONDS);
        return res;

    }

    public Flux<AlbumModel> getTrendingAlbum(){
        return webClient
                .client()
                .get()
                .uri(trendingAlbum)
                .retrieve()
                .bodyToFlux(AlbumModel.class);
    }

    public Flux<TrendingArtistsModel> getTrendingArtists(){
        return webClient
                .client()
                .get()
                .uri(trendingArtists)
                .retrieve()
                .bodyToFlux(TrendingArtistsModel.class);
    }

    public Flux<TrendingPlaylistsModel> getTrendingPlaylists(){
        return webClient
                .client()
                .get()
                .uri(trendingPlayList)
                .retrieve()
                .bodyToFlux(TrendingPlaylistsModel.class);
    }

    public Flux<TrendingPodcastsModel> getTrendingPodcasts(){
        return webClient
                .client()
                .get()
                .uri(trendingPodcasts)
                .retrieve()
                .bodyToFlux(TrendingPodcastsModel.class);
    }


}
