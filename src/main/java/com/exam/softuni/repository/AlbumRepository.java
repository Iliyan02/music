package com.exam.softuni.repository;

import com.exam.softuni.model.entity.*;
import com.exam.softuni.model.view.AlbumViewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    User findByName(String name);

    @Query("SELECT SUM(a.price) from Album a")
    BigDecimal findArtistPrice();

    List<AlbumViewModel> findAllByArtist_Name(ArtistName artistName);

    List<AlbumViewModel> findAllByGenre(Genre genre);
}
