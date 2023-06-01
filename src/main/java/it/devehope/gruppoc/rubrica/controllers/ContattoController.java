package it.devehope.gruppoc.rubrica.controllers;

import it.devehope.gruppoc.rubrica.models.Contatto;
import it.devehope.gruppoc.rubrica.services.ContattoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contatto/v1")
public class ContattoController {

    @Autowired
    public ContattoService contattoService;

    @GetMapping(path = "/contatti", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Contatto> getContatti() {
        return contattoService.getContatti();
    }

    @PostMapping(path = "/contatto", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Contatto insertContatto(Contatto c) {
        
    }
}
