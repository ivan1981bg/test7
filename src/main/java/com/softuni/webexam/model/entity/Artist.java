package com.softuni.webexam.model.entity;

import com.softuni.webexam.model.entity.enums.BandName;

import javax.persistence.*;

@Entity
@Table(name = "artists")
public class Artist extends BaseEntity{

    private BandName name;
    private String careerInformation;

    public Artist() {
    }

    public Artist(BandName bandName, String careerInformation) {
        this.name = bandName;
        this.careerInformation = careerInformation;
    }


    @Enumerated(EnumType.STRING)
    public BandName getName() {
        return name;
    }

    public Artist setName(BandName name) {
        this.name = name;
        return this;
    }

    @Column(name = "career_information", columnDefinition = "TEXT")
    public String getCareerInformation() {
        return careerInformation;
    }

    public Artist setCareerInformation(String careerInformation) {
        this.careerInformation = careerInformation;
        return this;
    }
}
