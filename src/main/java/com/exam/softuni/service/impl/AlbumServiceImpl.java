package com.exam.softuni.service.impl;

import com.exam.softuni.model.entity.Album;
import com.exam.softuni.model.entity.ArtistName;
import com.exam.softuni.model.entity.Genre;
import com.exam.softuni.model.service.AlbumAddServiceModel;
import com.exam.softuni.model.view.AlbumViewModel;
import com.exam.softuni.repository.AlbumRepository;
import com.exam.softuni.repository.UserRepository;
import com.exam.softuni.service.AlbumService;
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
    private final UserRepository userRepository;
    private final HttpSession httpSession;

    public AlbumServiceImpl(AlbumRepository albumRepository, ModelMapper modelMapper, UserRepository userRepository, HttpSession httpSession) {
        this.albumRepository = albumRepository;
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
        this.httpSession = httpSession;
    }

    @Override
    public void addAlbum(AlbumAddServiceModel albumAddServiceModel) {
        Album album = modelMapper.map(albumAddServiceModel, Album.class);
        album.setUser(userRepository.findByUsername(httpSession.getId()));
        //не знам как да сетна user-а

        albumRepository.save(album);
    }

    @Override
    public BigDecimal getPrice() {
        return albumRepository.findArtistPrice();
    }

    @Override
    public List<AlbumViewModel> findAllArtistByArtistName(ArtistName artistName) {
        return albumRepository.findAllByArtist_Name(artistName)
                .stream().map(albumViewModel -> modelMapper.map(albumViewModel, AlbumViewModel.class))
                .collect(Collectors.toList());
    }

//    @Override
//    public List<AlbumViewModel> getGenreByGenre(Genre genre) {
//        return albumRepository.findAllByGenre(genre)
//                .stream().map(albumViewModel -> modelMapper.map(albumViewModel, AlbumViewModel.class))
//                .collect(Collectors.toList());
//    }


}
