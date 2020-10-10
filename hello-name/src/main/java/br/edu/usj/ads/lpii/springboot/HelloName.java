package br.edu.usj.ads.lpii.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloName {
   
    @PostMapping(value="hello-name")
    public ModelAndView postHelloName(@RequestParam String nome) {
        ModelAndView modelAndView = new ModelAndView("hello-name");

        String ola = "Seja bem vindo(a), "+nome+"!";
        modelAndView.addObject("mensagem", ola);
        return modelAndView;
    }
    


}
