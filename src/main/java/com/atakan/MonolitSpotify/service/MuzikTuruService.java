package com.atakan.MonolitSpotify.service;

import com.atakan.MonolitSpotify.repository.MuzikTuruRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MuzikTuruService{

    private final MuzikTuruRepository repository;

}
