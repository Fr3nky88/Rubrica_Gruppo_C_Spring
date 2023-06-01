package it.devehope.gruppoc.rubrica.services;

import it.devehope.gruppoc.rubrica.daos.ContattoDao;
import it.devehope.gruppoc.rubrica.models.Contatto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContattoService {

    @Autowired
    private ContattoDao contattoDao;

    public List<Contatto> getContatti() {
        return contattoDao.getContatti();
    }
}
