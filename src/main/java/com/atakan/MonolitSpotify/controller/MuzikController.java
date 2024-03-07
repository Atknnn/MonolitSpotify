package com.atakan.MonolitSpotify.controller;

import com.atakan.MonolitSpotify.constants.RestApi;
import com.atakan.MonolitSpotify.dto.request.AddMusicForArtistRequestDto;
import com.atakan.MonolitSpotify.dto.request.SaveMuzikRequestDto;
import com.atakan.MonolitSpotify.dto.response.FindAllMuzikResponseDto;
import com.atakan.MonolitSpotify.repository.entity.Muzik;
import com.atakan.MonolitSpotify.service.MuzikService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(RestApi.MUZIK)
@RequiredArgsConstructor
public class MuzikController {
    private final MuzikService muzikService;

    @PostMapping(RestApi.SAVE)
    public ResponseEntity<Void> saveMuzik(@RequestBody @Valid SaveMuzikRequestDto dto){
        muzikService.save(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping(RestApi.FINDALL)
    public ResponseEntity<FindAllMuzikResponseDto> findAll(){
        FindAllMuzikResponseDto result = muzikService.findAll();
        return ResponseEntity.ok(result);
    }

    @PostMapping(RestApi.ADDMUSICFORARTIST)
    public ResponseEntity<Void> addMusicForArtist(@RequestBody @Valid AddMusicForArtistRequestDto dto){
        muzikService.addMusicForArtist(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getAllMusicFromArtistId/{id}")
    public ResponseEntity<List<Muzik>> getAllMusicFromArtistId(@PathVariable("id") Long id){
        List<Muzik> result = muzikService.findAllMuzikFromArtistId(id);
        return ResponseEntity.ok(result);
    }
}
