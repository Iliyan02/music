package com.exam.softuni.web;

import com.exam.softuni.model.entity.ArtistName;
import com.exam.softuni.model.entity.Genre;
import com.exam.softuni.service.AlbumService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    private final AlbumService albumService;

    public HomeController(AlbumService albumService) {
        this.albumService = albumService;
    }


    @GetMapping("/")
    public String home(Model model, HttpSession httpSession){
        if (httpSession.getAttribute("user") == null){
            return "index";
        }

        model.addAttribute("price", albumService.getPrice());
        model.addAttribute("METALLICA", albumService.findAllArtistByArtistName(ArtistName.METALLICA));
        model.addAttribute("MADONNA", albumService.findAllArtistByArtistName(ArtistName.MADONNA));
        model.addAttribute("QUEEN", albumService.findAllArtistByArtistName(ArtistName.QUEEN));

//        model.addAttribute("POP", albumService.getGenreByGenre(Genre.POP));
//        model.addAttribute("ROCK", albumService.getGenreByGenre(Genre.ROCK));
//        model.addAttribute("METAL", albumService.getGenreByGenre(Genre.METAL));
//        model.addAttribute("OTHER", albumService.getGenreByGenre(Genre.OTHER));

        return "home";
    }
}
