package com.exam.softuni.model.binding;

import com.exam.softuni.model.entity.ArtistName;
import com.exam.softuni.model.entity.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AlbumAddBindingModel {
    @NotBlank(message = "Cannot be empty")
    @Size(min = 3, max = 20, message = "Name length must be between 3 and 20 characters")
    private String name;
    @NotBlank(message = "Cannot be empty")
    @Size(min = 5, message = "Image Url length must be minimum 5 characters.")
    private String imageUrl;
    @Positive
    private BigDecimal price;
    @Min(10)
    private int copies;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent
    private LocalDate releaseDate;
    private String producer;
    @NotNull(message = "You must select an artist")
    private ArtistName artist;
    @NotNull(message = "You must select a genre")
    private Genre genre;
    @NotBlank(message = "Cannot be empty")
    @Size(min = 5, message = "Description min length must be minimum 5 characters")
    private String description;
}
