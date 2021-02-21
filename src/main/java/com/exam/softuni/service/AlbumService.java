package com.exam.softuni.service;

import com.exam.softuni.model.entity.ArtistName;
import com.exam.softuni.model.entity.Genre;
import com.exam.softuni.model.service.AlbumAddServiceModel;
import com.exam.softuni.model.view.AlbumViewModel;

import java.math.BigDecimal;
import java.util.List;

public interface AlbumService {
    void addAlbum(AlbumAddServiceModel albumAddServiceModel);

    BigDecimal getPrice();

    List<AlbumViewModel> findAllArtistByArtistName(ArtistName metallica);

//    List<AlbumViewModel> getGenreByGenre(Genre genre);
}
