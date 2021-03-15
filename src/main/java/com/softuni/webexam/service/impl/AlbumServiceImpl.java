package com.softuni.webexam.service.impl;

import com.softuni.webexam.model.entity.Album;
import com.softuni.webexam.model.entity.User;
import com.softuni.webexam.model.service.AlbumServiceModel;
import com.softuni.webexam.model.service.UserServiceModel;
import com.softuni.webexam.model.view.AlbumViewModel;
import com.softuni.webexam.repository.AlbumRepository;
import com.softuni.webexam.service.AlbumService;
import com.softuni.webexam.service.ArtistService;
import com.softuni.webexam.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlbumServiceImpl implements AlbumService {

    private final AlbumRepository albumRepository;
    private final ModelMapper modelMapper;
    private final ArtistService artistService;
    private final UserService userService;


    public AlbumServiceImpl(AlbumRepository albumRepository, ModelMapper modelMapper, ArtistService artistService, UserService userService) {
        this.albumRepository = albumRepository;
        this.modelMapper = modelMapper;
        this.artistService = artistService;
        this.userService = userService;
    }

    @Override
    public void add(AlbumServiceModel albumServiceModel, HttpSession httpSession) {

        Album album = modelMapper.map(albumServiceModel, Album.class);
        album.setArtist(artistService.findByName(albumServiceModel.getArtist()));

        UserServiceModel userServiceModel = (UserServiceModel) httpSession.getAttribute("user");
        User user = userService.findUserByUsername(userServiceModel.getUsername());

        album.setAddedFrom(user);

        albumRepository.save(album);




    }

    @Override
    public List<AlbumViewModel> getAllAlbums() {

        return albumRepository.findAll()
                .stream()
                .sorted()
                .map(album -> modelMapper.map(album, AlbumViewModel.class))
                .collect(Collectors.toList());

    }

    @Override
    public BigDecimal getTotalCopies() {

        return albumRepository.findTotalCopiesSum();
    }
}
