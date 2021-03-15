package com.softuni.webexam.model.view;

import com.softuni.webexam.model.entity.Artist;
import com.softuni.webexam.model.entity.User;
import com.softuni.webexam.model.entity.enums.GenreName;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AlbumViewModel {

    private String id;
    private String name;
    private String imageUrl;

    private Integer copies;
    private BigDecimal price;
    private LocalDate date;

    private GenreName genre;
    private Artist artist;

    public AlbumViewModel() {
    }

    public String getId() {
        return id;
    }

    public AlbumViewModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AlbumViewModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public AlbumViewModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Integer getCopies() {
        return copies;
    }

    public AlbumViewModel setCopies(Integer copies) {
        this.copies = copies;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public AlbumViewModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public AlbumViewModel setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public GenreName getGenre() {
        return genre;
    }

    public AlbumViewModel setGenre(GenreName genre) {
        this.genre = genre;
        return this;
    }

    public Artist getArtist() {
        return artist;
    }

    public AlbumViewModel setArtist(Artist artist) {
        this.artist = artist;
        return this;
    }
}
