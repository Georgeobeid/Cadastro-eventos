package com.example.controllers;

import com.example.modelos.Evento;
import com.example.repositry.EventoRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    @Autowired
    private EventoRepositry er;

    @RequestMapping( value = "/cadastrarEvento",method = RequestMethod.GET)
    public String sayHello(){
        return "evento/formEvento";
    }


    @RequestMapping( value = "/cadastrarEvento",method = RequestMethod.POST)
    public String sayHello(Evento evento){
        er.save(evento);
        return "redirect:/cadastrarEvento";
    }

    @RequestMapping("/eventos")
    public ModelAndView listaEventos(){
        ModelAndView mv = new ModelAndView("index");
        Iterable<Evento> eventos = er.findAll();
        mv.addObject("eventos",eventos);
        return mv;
    }

    @RequestMapping("/{codigo}")
    public ModelAndView detalhesEvento(@PathVariable("codigo") long codigo ){
        Evento evento=er.findByCodigo(codigo);
        ModelAndView mv = new ModelAndView("detalhesEvento");
        mv.addObject("evento",evento);
        return mv;
    }
}
