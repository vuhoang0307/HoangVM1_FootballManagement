package com.gem.Controller;

import com.gem.Model.Team;
import com.gem.Service.TeamService;
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
public class TeamController {
    private TeamService teamService;

    @Autowired(required = true)
    @Qualifier(value = "teamService")
    public void setTeamService(TeamService ts){
        this.teamService = ts;
    }
    @RequestMapping(value = "/teams", method = RequestMethod.GET)
    public String listTeams(Model model) {
        model.addAttribute("team", new Team());
        model.addAttribute("listTeams", this.teamService.listTeams());
        return "team";
    }

    @RequestMapping(value = "/team/add", method = RequestMethod.POST)
    public String addTeam(@ModelAttribute("team") Team t) {

        if (t.getId() == 0) {
            this.teamService.addTeam(t);
        } else {
            this.teamService.updateTeam(t);
        }

        return "redirect:/teams";
    }
    @RequestMapping("/team/remove/{id}")
    public String removeTeam(@PathVariable("id") int id) {

        this.teamService.removeTeam(id);
        return "redirect:/teams";
    }

    @RequestMapping("/team/edit/{id}")
    public String editTeam(@PathVariable("id") int id, Model model) {
        model.addAttribute("team", this.teamService.getTeamById(id));
        model.addAttribute("listTeams", this.teamService.listTeams());
        return "team";
    }
}
