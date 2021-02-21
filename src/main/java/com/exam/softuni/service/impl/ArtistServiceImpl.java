package com.exam.softuni.service.impl;

import com.exam.softuni.model.entity.Artist;
import com.exam.softuni.model.entity.ArtistName;
import com.exam.softuni.repository.ArtistRepository;
import com.exam.softuni.service.ArtistService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ArtistServiceImpl implements ArtistService {
    private final ArtistRepository artistRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }


    @Override
    public void initArtists() {
        if (artistRepository.count() == 0){
            Arrays.stream(ArtistName.values())
                    .forEach(artistName -> {
                        Artist artist = new Artist(artistName,
                                "Description for:" + artistName.name());

                        artistRepository.save(artist);
                    });

            //нямам време иначе бих го направил с една if проверка
        }
    }
}
