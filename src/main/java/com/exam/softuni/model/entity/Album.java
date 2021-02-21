package com.exam.softuni.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "albums")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Album extends BaseEntity{
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "image_url", nullable = false)
    private String imageUrl;
    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;
    @Column(name = "copies", nullable = false)
    private Integer copies;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "release_date", nullable = false)
    private LocalDate releaseDate;
    @Column(name = "producer")
    private String producer;
    @Enumerated(EnumType.ORDINAL)
    private Genre genre;
    @ManyToOne(cascade = CascadeType.ALL)
    private Artist artist;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
}
