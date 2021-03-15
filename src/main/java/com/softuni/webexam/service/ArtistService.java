package com.softuni.webexam.service;

import com.softuni.webexam.model.entity.Artist;
import com.softuni.webexam.model.entity.enums.BandName;

public interface ArtistService {
    void initArtists();

    Artist findByName(BandName artist);
}
