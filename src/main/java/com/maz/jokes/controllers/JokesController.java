package com.maz.jokes.controllers;


import com.maz.jokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokeService joke;

    public JokesController(JokeService jokeService) {
        this.joke = jokeService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke",joke.getQuote());
        return "ChuckNorris";
    }
}
