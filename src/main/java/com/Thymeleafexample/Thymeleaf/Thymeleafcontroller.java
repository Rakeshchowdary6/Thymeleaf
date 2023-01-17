package com.Thymeleafexample.Thymeleaf;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Date;
import java.util.List;

@Controller
public class Thymeleafcontroller {

    @RequestMapping("/about")
    public String about(Model model){
        model.addAttribute("name","RAKESH KING ");
        model.addAttribute("exacttime",new Date().toString());
        return "about";
    }

    @GetMapping("/about/loop")
    public String thymleafiterartion(Model model){
        List<String> list = List.of("Rakesh", "Suresh", "Kohli");
        model.addAttribute("list",list);
        return "loopex";
    }

    @GetMapping("/about/check")
    public String conditional(Model model){
        model.addAttribute("Booleanvalue",false);
        return "conditional";
    }
}
