package jp.te4a.teama.rsv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="")

public class RsvController {
    @GetMapping(path="home")
    public String home(Model model) {
        return "home";
    }

    @GetMapping(path="rsv_apply")
    public String rsvApply(Model model) {
        return "rsv_apply";
    }

    @GetMapping(path="rsv_state")
    public String rsvState(Model model) {
        return "rsv_state";
    }
}

