package com.debbie.music.player.service.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@RequiredArgsConstructor
public class RedisService {
    private final RedisTemplate<Object, Object> redisTemplate;

//    public <V> void set(String cacheName, String key, V value, long timeout, TimeUnit timeUnit) {
//        redisTemplate.opsForValue().set(cacheName+key, value);
//        redisTemplate.expire(cacheName+key, timeout, timeUnit);
//    }

    public <V> void set(String cacheName,  V value, long timeout, TimeUnit timeUnit) {
        redisTemplate.opsForValue().set(cacheName, value);
        redisTemplate.expire(cacheName, timeout, timeUnit);
    }



    public <V> V get(String cacheName) {
        return (V) redisTemplate.opsForValue().get(cacheName);
    }

    public Boolean hasKey(String cacheName) {
        return redisTemplate.hasKey(cacheName);
    }
}
