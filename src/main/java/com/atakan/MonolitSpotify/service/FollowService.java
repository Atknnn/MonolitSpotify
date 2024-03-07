package com.atakan.MonolitSpotify.service;

import com.atakan.MonolitSpotify.repository.FollowRepository;
import com.atakan.MonolitSpotify.repository.entity.Follow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FollowService {
    private final FollowRepository repository;

    public void save(Follow entity){
        repository.save(entity);
    }
}
