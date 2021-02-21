package com.exam.softuni.model.view;

import com.exam.softuni.model.entity.Artist;
import com.exam.softuni.model.entity.ArtistName;
import com.exam.softuni.model.entity.Genre;
import com.exam.softuni.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AlbumViewModel {
    private String name;
    private String imageUrl;
    private String description;
    private Integer copies;
    private BigDecimal price;
    private LocalDate releaseDate;
    private String producer;
    private Genre genre;
    private Artist artist;
    private User user;
}
