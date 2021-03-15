package com.softuni.webexam.repository;

import com.softuni.webexam.model.entity.Artist;
import com.softuni.webexam.model.entity.enums.BandName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, String> {

    Optional<Artist> findByName(BandName artist);


}
