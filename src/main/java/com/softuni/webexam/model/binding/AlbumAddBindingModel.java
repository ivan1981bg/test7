package com.softuni.webexam.model.binding;

import com.softuni.webexam.model.entity.Artist;
import com.softuni.webexam.model.entity.User;
import com.softuni.webexam.model.entity.enums.BandName;
import com.softuni.webexam.model.entity.enums.GenreName;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class AlbumAddBindingModel {


    private String name;
    private String imageUrl;
    private BigDecimal price;
    private Integer copies;
    private LocalDate date;
    private String producer;
    private BandName artist;
    private GenreName genre;
    private String description;

    public AlbumAddBindingModel() {
    }


    @Size(min = 3, max = 20, message = "Name must be between 3 and 20 characters")
    @NotBlank(message = "Cannot be empty")
    public String getName() {
        return name;
    }

    public AlbumAddBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    @Size(min = 5, max = 20, message = "Image url must be minimum 5 characters")
    @NotBlank(message = "Cannot be empty")
    public String getImageUrl() {
        return imageUrl;
    }

    public AlbumAddBindingModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    @Positive(message = "Price must be positive number")
    public BigDecimal getPrice() {
        return price;
    }

    public AlbumAddBindingModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    @Min(value=10, message = "Copies must be more than 10" )
    public Integer getCopies() {
        return copies;
    }

    public AlbumAddBindingModel setCopies(Integer copies) {
        this.copies = copies;
        return this;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message = "Release date cannot be in the future")
    public LocalDate getDate() {
        return date;
    }

    public AlbumAddBindingModel setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public String getProducer() {
        return producer;
    }

    public AlbumAddBindingModel setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    @NotNull(message = "You must select artist")
    public BandName getArtist() {
        return artist;
    }

    public AlbumAddBindingModel setArtist(BandName artist) {
        this.artist = artist;
        return this;
    }

    @NotNull(message = "You must select genre")
    public GenreName getGenre() {
        return genre;
    }

    public AlbumAddBindingModel setGenre(GenreName genre) {
        this.genre = genre;
        return this;
    }

    @Size(min = 5, message = "Description length must be minimum 5 characters")
    @NotBlank(message = "Cannot be empty")
    public String getDescription() {
        return description;
    }

    public AlbumAddBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }
}
