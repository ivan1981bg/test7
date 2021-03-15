package com.softuni.webexam.model.service;

import com.softuni.webexam.model.entity.Artist;
import com.softuni.webexam.model.entity.User;
import com.softuni.webexam.model.entity.enums.BandName;
import com.softuni.webexam.model.entity.enums.GenreName;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AlbumServiceModel {

    private String id;
    private String name;
    private String imageUrl;
    private String description;
    private Integer copies;
    private BigDecimal price;
    private LocalDate date;
    private String producer;
    private GenreName genre;
    private BandName artist;
    private User addedFrom;

    public AlbumServiceModel() {
    }

    public String getId() {
        return id;
    }

    public AlbumServiceModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AlbumServiceModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public AlbumServiceModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AlbumServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getCopies() {
        return copies;
    }

    public AlbumServiceModel setCopies(Integer copies) {
        this.copies = copies;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public AlbumServiceModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public AlbumServiceModel setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public String getProducer() {
        return producer;
    }

    public AlbumServiceModel setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public GenreName getGenre() {
        return genre;
    }

    public AlbumServiceModel setGenre(GenreName genre) {
        this.genre = genre;
        return this;
    }

    public BandName getArtist() {
        return artist;
    }

    public AlbumServiceModel setArtist(BandName artist) {
        this.artist = artist;
        return this;
    }

    public User getAddedFrom() {
        return addedFrom;
    }

    public AlbumServiceModel setAddedFrom(User addedFrom) {
        this.addedFrom = addedFrom;
        return this;
    }
}
