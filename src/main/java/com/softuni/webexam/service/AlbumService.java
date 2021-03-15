package com.softuni.webexam.service;

import com.softuni.webexam.model.service.AlbumServiceModel;
import com.softuni.webexam.model.view.AlbumViewModel;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

public interface AlbumService {
    void add(AlbumServiceModel albumServiceModel, HttpSession httpSession);

    List<AlbumViewModel> getAllAlbums();

    BigDecimal getTotalCopies();
}
