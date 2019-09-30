package codegym.controllers;

import codegym.service.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @PostMapping("/result")
    public ModelAndView result(@RequestParam("word") String word) {
        ModelAndView modelAndView = new ModelAndView("/index");
        Dictionary dic = new Dictionary();
        String result = dic.search(word);
        modelAndView.addObject("ketqua",result);
        return modelAndView;
    }

}
