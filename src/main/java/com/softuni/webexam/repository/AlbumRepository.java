package com.softuni.webexam.repository;

import com.softuni.webexam.model.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album, String> {


    @Query("SELECT SUM(a.copies) FROM Album a")
    BigDecimal findTotalCopiesSum();
}
