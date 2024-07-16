package jp.te4a.teama.rsv.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.te4a.teama.rsv.component.DateUtil;
import jp.te4a.teama.rsv.form.RsvForm;
import jp.te4a.teama.rsv.service.RsvService;

@Controller
@RequestMapping(path="")

public class RsvController {
    @Autowired
    private RsvService rsvServ;

    @GetMapping(path="home")
    public String home(Model model) {
        return "home";
    }

    @GetMapping(path="rsv_apply")
    public String rsvApply(RsvForm rsvForm, Model model) {

        return "rsv_apply";
    }

    @PostMapping(path="rsv_submit")
    public String rsvSubmit(@Validated RsvForm rsvForm, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return rsvApply(rsvForm, model);
        }

        rsvServ.save(rsvForm);
        return rsvApplyComplete(model);
    }

    @GetMapping(path="rsv_apply_complete")
    public String rsvApplyComplete(Model model) {
        return "rsv_apply_complete";
    }

    @GetMapping(path="rsv_state")
    public String rsvState(Model model) {
        return rsvState(model, DateUtil.getToday());
    }

    @GetMapping(path="rsv_state/{date}")
    public String rsvState(Model model, @PathVariable String date) {
        try {
            model.addAttribute("rsv", rsvServ.findByDate(date));
        } catch (NoSuchElementException ex) {
            ex.printStackTrace();
        }

        return "rsv_state";
    }
}

