package com.gem.Controller;

import com.gem.Model.Leage;
import com.gem.Service.LeageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by MINHHOANG-PC on 10/06/2017.
 */
@Controller
public class LeageController {
    private LeageService leageService;

    @Autowired(required = true)
    @Qualifier(value = "leageService")
    public void setLeageService(LeageService ls){
        this.leageService = ls;
    }
    @RequestMapping(value = "/leages", method = RequestMethod.GET)
    public String listLeages(Model model) {
        model.addAttribute("leage", new Leage());
        model.addAttribute("listLeages", this.leageService.listLeages());
        return "leage";
    }
    @RequestMapping(value = "/leage/add", method = RequestMethod.POST)
    public String addLeage(@ModelAttribute("leage") Leage l) {

        if (l.getId() == 0) {
            this.leageService.addLeage(l);
        } else {
            this.leageService.updateLeage(l);
        }

        return "redirect:/leages";
    }
    @RequestMapping("/leage/remove/{id}")
    public String removeLeage(@PathVariable("id") int id) {

        this.leageService.removeLeage(id);
        return "redirect:/leages";
    }

    @RequestMapping("/leage/edit/{id}")
    public String editLeage(@PathVariable("id") int id, Model model) {
        model.addAttribute("leage", this.leageService.getLeageById(id));
        model.addAttribute("listLeages", this.leageService.listLeages());
        return "leage";
    }
}
