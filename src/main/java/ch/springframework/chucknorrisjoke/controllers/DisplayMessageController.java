package ch.springframework.chucknorrisjoke.controllers;

import ch.springframework.chucknorrisjoke.services.DisplayService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chuck-norris")
public class DisplayMessageController {

    private final DisplayService displayService;

    public DisplayMessageController(DisplayService displayService) {
        this.displayService = displayService;
    }
    @GetMapping("/get-quote")
    public String getQuote(Model model) {
        model.addAttribute("quote", displayService.getRandomMessage());
        return "quotes/list";
    }
}
