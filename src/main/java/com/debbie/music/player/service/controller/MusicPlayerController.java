package com.debbie.music.player.service.controller;


import com.debbie.music.player.service.model.AlbumModel;
import com.debbie.music.player.service.model.TracksModel;
import com.debbie.music.player.service.model.trending.TrendingArtistsModel;
import com.debbie.music.player.service.model.trending.TrendingPlaylistsModel;
import com.debbie.music.player.service.model.trending.TrendingPodcastsModel;
import com.debbie.music.player.service.service.MusicPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/music-player/")
public class MusicPlayerController {


    private final MusicPlayerService musicPlayerService;

    public MusicPlayerController(MusicPlayerService musicPlayerService) {
        this.musicPlayerService = musicPlayerService;
    }

    @GetMapping("/trending-tracks")
    public Flux<TracksModel> getTrendingTracks(){
        return musicPlayerService.getTrendingTracks();
    }

    @GetMapping("/trending-albums")
    public Flux<AlbumModel> getTrendingAlbums(){
        return musicPlayerService.getTrendingAlbum();
    }

    @GetMapping("/trending-artists")
    public Flux<TrendingArtistsModel> getTrendingArtists(){
        return musicPlayerService.getTrendingArtists();
    }

    @GetMapping("/trending-playlists")
    public Flux<TrendingPlaylistsModel> getTrendingPlaylists(){
        return musicPlayerService.getTrendingPlaylists();
    }

    @GetMapping("/trending-podcasts")
    public Flux<TrendingPodcastsModel> getTrendingPodcasts(){
        return musicPlayerService.getTrendingPodcasts();
    }

}
