package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("user")
public class MainController {
    User user;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String user(Model model){
        user  = new User();
        model.addAttribute("user",user);
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb")User user, Model model) {

        model.addAttribute("userName", user.getName());
        return "result";
    }
}
