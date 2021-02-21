package com.exam.softuni.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "artists")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Artist extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private ArtistName name;
    @Column(name = "career_information", columnDefinition = "TEXT")
    private String careerInformation;
}
