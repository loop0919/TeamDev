package jp.te4a.teama.rsv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="")

public class RevController {
    @GetMapping(path="home")
    public String home(Model model) {
        return "home";
    }
}

